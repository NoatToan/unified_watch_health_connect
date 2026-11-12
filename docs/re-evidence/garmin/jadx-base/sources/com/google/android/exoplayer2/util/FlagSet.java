package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes14.dex */
public final class FlagSet {
    private final SparseBooleanArray flags;

    private FlagSet(SparseBooleanArray sparseBooleanArray) {
        this.flags = sparseBooleanArray;
    }

    public boolean contains(int i14) {
        return this.flags.get(i14);
    }

    public boolean containsAny(int... iArr) {
        for (int i14 : iArr) {
            if (contains(i14)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagSet)) {
            return false;
        }
        FlagSet flagSet = (FlagSet) obj;
        if (Util.SDK_INT >= 24) {
            return this.flags.equals(flagSet.flags);
        }
        if (size() != flagSet.size()) {
            return false;
        }
        for (int i14 = 0; i14 < size(); i14++) {
            if (get(i14) != flagSet.get(i14)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i14) {
        Assertions.checkIndex(i14, 0, size());
        return this.flags.keyAt(i14);
    }

    public int hashCode() {
        if (Util.SDK_INT >= 24) {
            return this.flags.hashCode();
        }
        int size = size();
        for (int i14 = 0; i14 < size(); i14++) {
            size = (size * 31) + get(i14);
        }
        return size;
    }

    public int size() {
        return this.flags.size();
    }

    public static final class Builder {
        private boolean buildCalled;
        private final SparseBooleanArray flags = new SparseBooleanArray();

        public Builder add(int i14) {
            Assertions.checkState(!this.buildCalled);
            this.flags.append(i14, true);
            return this;
        }

        public Builder addAll(FlagSet flagSet) {
            for (int i14 = 0; i14 < flagSet.size(); i14++) {
                add(flagSet.get(i14));
            }
            return this;
        }

        public Builder addIf(int i14, boolean z14) {
            return z14 ? add(i14) : this;
        }

        public FlagSet build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new FlagSet(this.flags);
        }

        public Builder remove(int i14) {
            Assertions.checkState(!this.buildCalled);
            this.flags.delete(i14);
            return this;
        }

        public Builder removeAll(int... iArr) {
            for (int i14 : iArr) {
                remove(i14);
            }
            return this;
        }

        public Builder removeIf(int i14, boolean z14) {
            return z14 ? remove(i14) : this;
        }

        public Builder addAll(int... iArr) {
            for (int i14 : iArr) {
                add(i14);
            }
            return this;
        }
    }
}
