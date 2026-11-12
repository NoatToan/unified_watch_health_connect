package nv2;

import android.content.Context;
import androidx.fragment.app.Fragment;
import cx2.h;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnv2/f;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Lnv2/e;", "transform", "Ldx2/c;", "settingsViewModel", "", "", "viewAttributeMap", "<init>", "(Landroidx/fragment/app/Fragment;Lnv2/e;Ldx2/c;Ljava/util/Map;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f127976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f127977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx2.c f127978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, ? extends Object> f127979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f127980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f127981f;

    public f(Fragment fragment, e eVar, dx2.c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        eVar.getClass();
        cVar.getClass();
        map.getClass();
        this.f127976a = fragment;
        this.f127977b = eVar;
        this.f127978c = cVar;
        this.f127979d = map;
        this.f127980e = new h("TimePicker", null, 2, null);
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this.f127981f = contextRequireContext;
    }
}
