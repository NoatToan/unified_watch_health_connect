package androidx.browser.trusted;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import j20.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f5326a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f5328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f5329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s.a f5330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s.b f5331f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.e.d f5327b = new r.e.d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f5332g = new g.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5333h = 0;

    public i(Uri uri) {
        this.f5326a = uri;
    }

    public final h a(r.g gVar) {
        if (gVar == null) {
            x.l("CustomTabsSession is required for launching a TWA");
            return null;
        }
        r.e.d dVar = this.f5327b;
        dVar.b(gVar);
        Intent intent = dVar.a().f148677a;
        intent.setData(this.f5326a);
        intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (this.f5328c != null) {
            intent.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(this.f5328c));
        }
        Bundle bundle = this.f5329d;
        if (bundle != null) {
            intent.putExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS", bundle);
        }
        List<Uri> list = Collections.EMPTY_LIST;
        s.b bVar = this.f5331f;
        if (bVar != null && this.f5330e != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.browser.trusted.sharing.KEY_ACTION", bVar.f155242a);
            bundle2.putString("androidx.browser.trusted.sharing.KEY_METHOD", bVar.f155243b);
            bundle2.putString("androidx.browser.trusted.sharing.KEY_ENCTYPE", bVar.f155244c);
            s.b.C2944b c2944b = bVar.f155245d;
            c2944b.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putString("androidx.browser.trusted.sharing.KEY_TITLE", c2944b.f155248a);
            bundle3.putString("androidx.browser.trusted.sharing.KEY_TEXT", c2944b.f155249b);
            List<s.b.a> list2 = c2944b.f155250c;
            if (list2 != null) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (s.b.a aVar : list2) {
                    aVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("androidx.browser.trusted.sharing.KEY_FILE_NAME", aVar.f155246a);
                    bundle4.putStringArrayList("androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES", new ArrayList<>(aVar.f155247b));
                    arrayList.add(bundle4);
                }
                bundle3.putParcelableArrayList("androidx.browser.trusted.sharing.KEY_FILES", arrayList);
            }
            bundle2.putBundle("androidx.browser.trusted.sharing.KEY_PARAMS", bundle3);
            intent.putExtra("androidx.browser.trusted.extra.SHARE_TARGET", bundle2);
            s.a aVar2 = this.f5330e;
            aVar2.getClass();
            Bundle bundle5 = new Bundle();
            bundle5.putString("androidx.browser.trusted.sharing.KEY_TITLE", aVar2.f155239a);
            bundle5.putString("androidx.browser.trusted.sharing.KEY_TEXT", aVar2.f155240b);
            List<Uri> list3 = aVar2.f155241c;
            if (list3 != null) {
                bundle5.putParcelableArrayList("androidx.browser.trusted.sharing.KEY_URIS", new ArrayList<>(list3));
            }
            intent.putExtra("androidx.browser.trusted.extra.SHARE_DATA", bundle5);
            List<Uri> list4 = this.f5330e.f155241c;
            if (list4 != null) {
                list = list4;
            }
        }
        intent.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", this.f5332g.toBundle());
        intent.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", this.f5333h);
        return new h(intent, list);
    }
}
