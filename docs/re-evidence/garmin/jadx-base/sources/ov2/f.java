package ov2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.edittext.utils.StyledInlineTextFieldViewDark;
import e23.l;
import java.util.Map;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lov2/f;", "Lfw2/a;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lov2/e;", "transform", "Ldx2/c;", "settingsViewModel", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lov2/e;Ldx2/c;Ljava/util/Map;)V", "Lcom/garmin/realtimesettings/app/baseviews/edittext/utils/StyledInlineTextFieldViewDark;", "a", "Lcom/garmin/realtimesettings/app/baseviews/edittext/utils/StyledInlineTextFieldViewDark;", "getEditTextView", "()Lcom/garmin/realtimesettings/app/baseviews/edittext/utils/StyledInlineTextFieldViewDark;", "editTextView", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends fw2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f134271b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final StyledInlineTextFieldViewDark editTextView;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f134273a;

        public a(l lVar) {
            lVar.getClass();
            this.f134273a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f134273a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f134273a.invoke(obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Fragment fragment, e eVar, dx2.c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        eVar.getClass();
        cVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, (AttributeSet) null, 2, (j) (0 == true ? 1 : 0));
        cVar.f61486c.f(fragment.getViewLifecycleOwner(), new a(new jv0.c(this, cVar, map, eVar, fragment, 13)));
    }

    public final StyledInlineTextFieldViewDark getEditTextView() {
        return this.editTextView;
    }

    public /* synthetic */ f(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, R.layout.rts_edit_text_view, this);
        View viewFindViewById = findViewById(R.id.edit_text);
        viewFindViewById.getClass();
        this.editTextView = (StyledInlineTextFieldViewDark) viewFindViewById;
    }
}
