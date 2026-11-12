package bt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class h extends p005kotlin.jvm.internal.q implements e23.l<String, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f21111a = new h();

    public h() {
        super(1, i.class, "convertElevationStringValueToFloat", "convertElevationStringValueToFloat(Ljava/lang/String;)F", 1);
    }

    @Override // e23.l
    public final Float invoke(String str) {
        float f14;
        String str2 = str;
        str2.getClass();
        try {
            f14 = Float.parseFloat(d53.u.v(d53.u.v(str2, ".", "", false), ",", "", false));
        } catch (NumberFormatException unused) {
            f14 = Float.NaN;
        }
        return Float.valueOf(f14);
    }
}
