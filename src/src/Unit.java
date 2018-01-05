package src;

public interface Unit
{
    public String getName();
    public int getLethality();
    public int getSurvivability();


    class Hidden
    {
        protected static class DefaultUnit implements Unit
        {

            protected String name;
            protected int lethality, survivability;


            private DefaultUnit()
            {
                this.name = "null";
                this.lethality = 0;
                this.survivability = 0;
            }
            private DefaultUnit(Builder b)
            {
                this.name = b.name;
                this.lethality = b.lethality;
                this.survivability = b.survivability;
            }


            @Override
            public String getName()
            {
                return null;
            }

            @Override
            public int getLethality()
            {
                return lethality;
            }

            @Override
            public int getSurvivability()
            {
                return survivability;
            }
        }
    }
    class Builder extends Hidden.DefaultUnit
    {
        public Builder()
        {

        }
        public Builder lethality(int i)
        {
            this.lethality = i;
            return this;
        }
        public Builder survivability(int i)
        {
            this.survivability = i;
            return this;
        }
        public Builder name(String s)
        {
            this.name = s;
            return this;
        }
        public Unit build()
        {
            return new Hidden.DefaultUnit(this);
        }
    }
}