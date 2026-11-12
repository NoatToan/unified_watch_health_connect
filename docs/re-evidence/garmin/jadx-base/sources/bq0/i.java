package bq0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbq0/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f19504d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l f19505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.c<f.j> f19506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<String[]> f19507c;

    static {
        new a(null);
    }

    public i() {
        final int i14 = 0;
        f.c<f.j> cVarRegisterForActivityResult = registerForActivityResult(new g.e(), new f.b(this) { // from class: bq0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f19503b;

            {
                this.f19503b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Context context;
                ContentResolver contentResolver;
                int i15 = i14;
                i iVar = this.f19503b;
                switch (i15) {
                    case 0:
                        Uri uri = (Uri) obj;
                        int i16 = i.f19504d;
                        if (uri == null) {
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.f(a2Var, "PhotoPickerFragment", "No media selected");
                        } else {
                            if (Build.VERSION.SDK_INT > 29 && (context = iVar.getContext()) != null && (contentResolver = context.getContentResolver()) != null) {
                                contentResolver.takePersistableUriPermission(uri, 1);
                            }
                            com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l lVar = iVar.f19505a;
                            if (lVar == null) {
                                i2.a aVar2 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar2.getClass();
                                i2.a.f(a2Var2, "PhotoPickerFragment", "callback is not initialized");
                            } else {
                                lVar.invoke(uri);
                            }
                        }
                        break;
                    default:
                        Map map = (Map) obj;
                        int i17 = i.f19504d;
                        map.getClass();
                        if (s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            iVar.f19506b.a(f.k.a(g.e.d.f74074a, 0, 14), null);
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f19506b = cVarRegisterForActivityResult;
        final int i15 = 1;
        f.c<String[]> cVarRegisterForActivityResult2 = registerForActivityResult(new g.f(), new f.b(this) { // from class: bq0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f19503b;

            {
                this.f19503b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Context context;
                ContentResolver contentResolver;
                int i16 = i15;
                i iVar = this.f19503b;
                switch (i16) {
                    case 0:
                        Uri uri = (Uri) obj;
                        int i17 = i.f19504d;
                        if (uri == null) {
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.f(a2Var, "PhotoPickerFragment", "No media selected");
                        } else {
                            if (Build.VERSION.SDK_INT > 29 && (context = iVar.getContext()) != null && (contentResolver = context.getContentResolver()) != null) {
                                contentResolver.takePersistableUriPermission(uri, 1);
                            }
                            com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l lVar = iVar.f19505a;
                            if (lVar == null) {
                                i2.a aVar2 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar2.getClass();
                                i2.a.f(a2Var2, "PhotoPickerFragment", "callback is not initialized");
                            } else {
                                lVar.invoke(uri);
                            }
                        }
                        break;
                    default:
                        Map map = (Map) obj;
                        int i18 = i.f19504d;
                        map.getClass();
                        if (s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            iVar.f19506b.a(f.k.a(g.e.d.f74074a, 0, 14), null);
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f19507c = cVarRegisterForActivityResult2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbq0/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
