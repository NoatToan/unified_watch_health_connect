package fu2;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfu2/i;", "", "Landroid/content/Context;", "appContext", "", "deviceUnitID", "deviceSoftwarePartNumber", "deviceFirmwareVersion", "oAuth2ITAccessToken", "language", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f73604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f73607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f73608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f73609f;

    public /* synthetic */ i(Context context, String str, String str2, String str3, String str4, String str5, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, str4, (i14 & 32) != 0 ? null : str5);
    }

    public i(Context context, String str, String str2, String str3, String str4, String str5) {
        context.getClass();
        str4.getClass();
        this.f73604a = context;
        this.f73605b = str;
        this.f73606c = str2;
        this.f73607d = str3;
        this.f73608e = str4;
        this.f73609f = str5;
    }
}
