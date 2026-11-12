package c80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc80/d1;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum d1 {
    UAC,
    UAC_SOS,
    CWC,
    OMT;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25353a;

        static {
            int[] iArr = new int[d1.values().length];
            try {
                iArr[d1.UAC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d1.UAC_SOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d1.CWC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d1.OMT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f25353a = iArr;
        }
    }
}
