package org.eclipse.californium.core.coap;

/* JADX INFO: loaded from: classes20.dex */
public final class OptionNumberRegistry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    private static volatile CustomOptionNumberRegistry f44407b;

    @Deprecated
    public interface CustomOptionNumberRegistry {
        void assertValue(int i, long j);

        int[] getCriticalCustomOptions();

        OptionFormat getFormatByNr(int i);

        int[] getValueLengths(int i);

        boolean isSingleValue(int i);

        int toNumber(String str);

        String toString(int i);
    }

    public enum OptionFormat {
        INTEGER,
        STRING,
        OPAQUE,
        UNKNOWN,
        EMPTY
    }

    public static boolean c(int i) {
        return (i & 1) != 0;
    }

    @Deprecated
    public static int[] e() {
        CustomOptionNumberRegistry customOptionNumberRegistry = f44407b;
        if (customOptionNumberRegistry != null) {
            return customOptionNumberRegistry.getCriticalCustomOptions();
        }
        return null;
    }

    @Deprecated
    public static CustomOptionNumberRegistry a() {
        return f44407b;
    }
}
