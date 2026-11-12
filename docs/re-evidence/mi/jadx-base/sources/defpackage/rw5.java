package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class rw5 {
    public a0l a(zzk zzkVar) {
        String str = (String) rk1.e(zzkVar.c.l);
        str.hashCode();
        switch (str) {
            case "audio/mp4a-latm":
                return new rzk(zzkVar);
            case "audio/ac3":
                return new szk(zzkVar);
            case "video/avc":
                return new vzk(zzkVar);
            default:
                return null;
        }
    }
}
