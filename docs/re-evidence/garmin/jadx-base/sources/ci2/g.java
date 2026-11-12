package ci2;

import android.content.DialogInterface;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f27694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HashMap f27697e;

    public /* synthetic */ g(l lVar, String str, String str2, HashMap map, int i14) {
        this.f27693a = i14;
        this.f27694b = lVar;
        this.f27695c = str;
        this.f27696d = str2;
        this.f27697e = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f27693a) {
            case 0:
                String str = this.f27695c;
                str.getClass();
                String str2 = this.f27696d;
                str2.getClass();
                HashMap<String, Object> map = this.f27697e;
                map.getClass();
                l lVar = this.f27694b;
                lVar.f27707a.f50677n++;
                lVar.c(str, str2, map);
                break;
            default:
                l lVar2 = this.f27694b;
                lVar2.getClass();
                String str3 = this.f27695c;
                str3.getClass();
                String str4 = this.f27696d;
                str4.getClass();
                HashMap<String, Object> map2 = this.f27697e;
                map2.getClass();
                lVar2.f27707a.f50678o++;
                lVar2.c(str3, str4, map2);
                break;
        }
    }
}
