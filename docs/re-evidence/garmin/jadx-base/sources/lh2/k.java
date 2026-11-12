package lh2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import java.util.Arrays;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Llh2/k;", "Llh2/b;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lii2/b;", "settingsViewModel", "Lei2/h;", "transform", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lii2/b;Lei2/h;Ljava/util/Map;)V", "url", "", "setLinkClickListener", "(Ljava/lang/String;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f112507d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hi2.d f112508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StyledTextView f112509c;

    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public k(Fragment fragment, ii2.b bVar, ei2.h hVar, Map<String, ? extends Object> map) {
        int i14;
        fragment.getClass();
        bVar.getClass();
        hVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, (AttributeSet) null, 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        String str = (String) map.get(mh2.i.STYLE.f118617a);
        mh2.k kVar = mh2.k.LINK;
        if (p005kotlin.jvm.internal.s.g(str, kVar.f118633a)) {
            setLinkClickListener((String) map.get(mh2.i.URL.f118617a));
        }
        if (!(hVar instanceof di2.b)) {
            this.f112509c.setText(hVar.j(bVar, map));
        }
        if (p005kotlin.jvm.internal.s.g(str, mh2.k.TITLE.f118633a)) {
            i14 = R.style.DSLHelpTextTitle;
        } else if (p005kotlin.jvm.internal.s.g(str, mh2.k.SUBTITLE.f118633a)) {
            i14 = R.style.DSLHelpTextSubtitle;
        } else if (p005kotlin.jvm.internal.s.g(str, mh2.k.BODY.f118633a)) {
            i14 = R.style.DSLHelpTextBody;
        } else if (p005kotlin.jvm.internal.s.g(str, mh2.k.BULLET.f118633a)) {
            x0 x0Var = x0.f105818a;
            String string = getContext().getString(R.string.settings_bullet_placeholder);
            string.getClass();
            this.f112509c.setText(String.format(string, Arrays.copyOf(new Object[]{hVar.j(bVar, map)}, 1)));
            i14 = R.style.DSLHelpTextBullet;
        } else if (p005kotlin.jvm.internal.s.g(str, mh2.k.INFO.f118633a)) {
            i14 = R.style.DSLInfoTextView;
        } else if (p005kotlin.jvm.internal.s.g(str, kVar.f118633a)) {
            i14 = R.style.DSLLinkTextView;
        } else if (p005kotlin.jvm.internal.s.g(str, mh2.k.DISCLOSURE.f118633a)) {
            i14 = R.style.DSLDisclosureTextView;
        } else {
            i14 = R.style.DSLHelpTextBody;
        }
        this.f112509c.setTextAppearance(i14);
        bVar.f93793c.f(fragment.getViewLifecycleOwner(), new hc0.e(hVar, bVar, map, this, 2));
    }

    private final void setLinkClickListener(String url) {
        setOnClickListener(new hx0.k(26, url, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f112508b = new hi2.d("InformationView", null, 2, null);
        View.inflate(context, R.layout.dsl_information_view, this);
        View viewFindViewById = findViewById(R.id.help_text_view);
        viewFindViewById.getClass();
        this.f112509c = (StyledTextView) viewFindViewById;
    }

    public /* synthetic */ k(Context context, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }
}
