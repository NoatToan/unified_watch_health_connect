package bv2;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B5\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lbv2/a;", "Lfw2/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lzw2/f;", "transform", "Ldx2/c;", "settingsViewModel", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lzw2/f;Ldx2/c;Ljava/util/Map;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends fw2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21461b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f21462a;

    /* JADX INFO: renamed from: bv2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0328a implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f21463a;

        public C0328a(e23.l lVar) {
            lVar.getClass();
            this.f21463a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f21463a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f21463a.invoke(obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Fragment fragment, zw2.f fVar, dx2.c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        fVar.getClass();
        cVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext);
        cVar.f61486c.f(fragment.getViewLifecycleOwner(), new C0328a(new a4.a(this, cVar, map, fVar)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, null, 2, null);
        context.getClass();
        View.inflate(context, R.layout.rts_center_image_row, this);
        View viewFindViewById = findViewById(R.id.center_image_view);
        viewFindViewById.getClass();
        this.f21462a = (AppCompatImageView) viewFindViewById;
    }
}
