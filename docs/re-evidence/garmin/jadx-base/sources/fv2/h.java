package fv2;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lfv2/h;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Lfv2/g;", "transform", "Ldx2/c;", "settingsViewModel", "", "", "viewAttrs", "<init>", "(Landroidx/fragment/app/Fragment;Lfv2/g;Ldx2/c;Ljava/util/Map;)V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final cx2.h f73755f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f73756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f73757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx2.c f73758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, ? extends Object> f73759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f73760e;

    static {
        new a(null);
        f73755f = new cx2.h("DatePickerView", null, 2, null);
    }

    public h(Fragment fragment, g gVar, dx2.c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        gVar.getClass();
        cVar.getClass();
        map.getClass();
        this.f73756a = fragment;
        this.f73757b = gVar;
        this.f73758c = cVar;
        this.f73759d = map;
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this.f73760e = contextRequireContext;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfv2/h$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
