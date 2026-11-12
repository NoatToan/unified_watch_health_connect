package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class FlagSet {
    private final SparseBooleanArray a;

    public boolean contains(int flag) {
        return this.a.get(flag);
    }

    public boolean containsAny(int... flags) {
        for (int i : flags) {
            if (contains(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof FlagSet) {
            return this.a.equals(((FlagSet) o).a);
        }
        return false;
    }

    public int get(int index) {
        Assertions.checkIndex(index, 0, size());
        return this.a.keyAt(index);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int size() {
        return this.a.size();
    }

    public static final class Builder {
        private final SparseBooleanArray a = new SparseBooleanArray();
        private boolean b;

        public Builder add(int flag) {
            Assertions.checkState(!this.b);
            this.a.append(flag, true);
            return this;
        }

        public Builder addAll(int... flags) {
            for (int i : flags) {
                add(i);
            }
            return this;
        }

        public Builder addIf(int flag, boolean condition) {
            return condition ? add(flag) : this;
        }

        public FlagSet build() {
            Assertions.checkState(!this.b);
            this.b = true;
            return new FlagSet(this.a);
        }

        public Builder remove(int flag) {
            Assertions.checkState(!this.b);
            this.a.delete(flag);
            return this;
        }

        public Builder removeAll(int... flags) {
            for (int i : flags) {
                remove(i);
            }
            return this;
        }

        public Builder removeIf(int flag, boolean condition) {
            return condition ? remove(flag) : this;
        }

        public Builder addAll(FlagSet flags) {
            for (int i = 0; i < flags.size(); i++) {
                add(flags.get(i));
            }
            return this;
        }
    }

    private FlagSet(SparseBooleanArray flags) {
        this.a = flags;
    }
}
