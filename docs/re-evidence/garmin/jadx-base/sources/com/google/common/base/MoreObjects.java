package com.google.common.base;

import ch.qos.logback.core.CoreConstants;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j20.x;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class MoreObjects {
    private MoreObjects() {
    }

    public static <T> T firstNonNull(T t7, T t14) {
        if (t7 != null) {
            return t7;
        }
        if (t14 != null) {
            return t14;
        }
        x.l("Both parameters are null");
        return null;
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static final class ToStringHelper {
        private final String className;
        private final ValueHolder holderHead;
        private ValueHolder holderTail;
        private boolean omitEmptyValues;
        private boolean omitNullValues;

        public static final class UnconditionalValueHolder extends ValueHolder {
            private UnconditionalValueHolder() {
            }
        }

        public static class ValueHolder {
            String name;
            ValueHolder next;
            Object value;
        }

        private ToStringHelper(String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.holderHead = valueHolder;
            this.holderTail = valueHolder;
            this.omitNullValues = false;
            this.omitEmptyValues = false;
            this.className = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        private ToStringHelper addHolder(String str, Object obj) {
            ValueHolder valueHolderAddHolder = addHolder();
            valueHolderAddHolder.value = obj;
            valueHolderAddHolder.name = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @CanIgnoreReturnValue
        private ToStringHelper addUnconditionalHolder(String str, Object obj) {
            UnconditionalValueHolder unconditionalValueHolderAddUnconditionalHolder = addUnconditionalHolder();
            unconditionalValueHolderAddUnconditionalHolder.value = obj;
            unconditionalValueHolderAddUnconditionalHolder.name = (String) Preconditions.checkNotNull(str);
            return this;
        }

        private static boolean isEmpty(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof Optional) {
                return !((Optional) obj).isPresent();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, boolean z14) {
            return addUnconditionalHolder(str, String.valueOf(z14));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(boolean z14) {
            return addUnconditionalHolder(String.valueOf(z14));
        }

        @CanIgnoreReturnValue
        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:19:0x005d  */
        public String toString() {
            String str;
            boolean z14 = this.omitNullValues;
            boolean z15 = this.omitEmptyValues;
            StringBuilder sb3 = new StringBuilder(32);
            sb3.append(this.className);
            sb3.append(CoreConstants.CURLY_LEFT);
            String str2 = "";
            for (ValueHolder valueHolder = this.holderHead.next; valueHolder != null; valueHolder = valueHolder.next) {
                Object obj = valueHolder.value;
                if (valueHolder instanceof UnconditionalValueHolder) {
                    sb3.append(str2);
                    str = valueHolder.name;
                    if (str != null) {
                        sb3.append(str);
                        sb3.append('=');
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb3.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb3.append(obj);
                    }
                    str2 = ", ";
                } else if (obj == null) {
                    if (!z14) {
                        sb3.append(str2);
                        str = valueHolder.name;
                        if (str != null) {
                            sb3.append(str);
                            sb3.append('=');
                        }
                        if (obj == null) {
                            sb3.append(obj);
                        } else {
                            sb3.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z15 || !isEmpty(obj)) {
                    sb3.append(str2);
                    str = valueHolder.name;
                    if (str != null) {
                        sb3.append(str);
                        sb3.append('=');
                    }
                    if (obj == null) {
                        sb3.append(obj);
                    } else {
                        sb3.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb3.append(CoreConstants.CURLY_RIGHT);
            return sb3.toString();
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, Object obj) {
            return addHolder(str, obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(Object obj) {
            return addHolder(obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, char c14) {
            return addUnconditionalHolder(str, String.valueOf(c14));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(char c14) {
            return addUnconditionalHolder(String.valueOf(c14));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, double d14) {
            return addUnconditionalHolder(str, String.valueOf(d14));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(double d14) {
            return addUnconditionalHolder(String.valueOf(d14));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, float f14) {
            return addUnconditionalHolder(str, String.valueOf(f14));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(float f14) {
            return addUnconditionalHolder(String.valueOf(f14));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, int i14) {
            return addUnconditionalHolder(str, String.valueOf(i14));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(int i14) {
            return addUnconditionalHolder(String.valueOf(i14));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, long j8) {
            return addUnconditionalHolder(str, String.valueOf(j8));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(long j8) {
            return addUnconditionalHolder(String.valueOf(j8));
        }

        @CanIgnoreReturnValue
        private ToStringHelper addHolder(Object obj) {
            addHolder().value = obj;
            return this;
        }

        @CanIgnoreReturnValue
        private ToStringHelper addUnconditionalHolder(Object obj) {
            addUnconditionalHolder().value = obj;
            return this;
        }

        private ValueHolder addHolder() {
            ValueHolder valueHolder = new ValueHolder();
            this.holderTail.next = valueHolder;
            this.holderTail = valueHolder;
            return valueHolder;
        }

        private UnconditionalValueHolder addUnconditionalHolder() {
            UnconditionalValueHolder unconditionalValueHolder = new UnconditionalValueHolder();
            this.holderTail.next = unconditionalValueHolder;
            this.holderTail = unconditionalValueHolder;
            return unconditionalValueHolder;
        }
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
