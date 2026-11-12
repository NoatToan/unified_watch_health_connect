package lh2;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import d53.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Llh2/m;", "Llh2/b;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lii2/b;", "settingsViewModel", "Lei2/h;", "transform", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lii2/b;Lei2/h;Ljava/util/Map;)V", "url", "", "setLinkClickListener", "(Ljava/lang/String;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f112515d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hi2.d f112516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StyledTextView f112517c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"lh2/m$a", "Landroid/text/style/ClickableSpan;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<String> f112519b;

        public a(r0<String> r0Var) {
            this.f112519b = r0Var;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            view2.getClass();
            m.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f112519b.f105810a)));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            Context context = m.this.getContext();
            if (context != null) {
                textPaint.setColor(a7.b.getColor(context, R.color.dsl_settings_color_accent));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public m(Fragment fragment, final ii2.b bVar, final ei2.h hVar, final Map<String, ? extends Object> map) {
        int i14;
        fragment.getClass();
        bVar.getClass();
        hVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, (AttributeSet) (0 == true ? 1 : 0), 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        String str = (String) map.get(mh2.i.STYLE.f118617a);
        mh2.k kVar = mh2.k.LINK;
        if (p005kotlin.jvm.internal.s.g(str, kVar.f118633a)) {
            setLinkClickListener((String) map.get(mh2.i.URL.f118617a));
        }
        Object obj = map.get(mh2.i.LINKS.f118617a);
        final ArrayList<String> arrayList = (ArrayList) (obj instanceof ArrayList ? obj : null);
        this.f112517c.setMovementMethod(LinkMovementMethod.getInstance());
        if (!(hVar instanceof di2.b)) {
            this.f112517c.setText(j(hVar.j(bVar, map), arrayList));
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
            this.f112517c.setText(j(String.format(string, Arrays.copyOf(new Object[]{hVar.j(bVar, map)}, 1)), arrayList));
            i14 = R.style.DSLHelpTextBullet;
        } else if (p005kotlin.jvm.internal.s.g(str, mh2.k.INFO.f118633a)) {
            Resources resources = getContext().getResources();
            float dimension = resources.getDimension(R.dimen.standard_partial_padding) / resources.getDisplayMetrics().density;
            float dimension2 = resources.getDimension(R.dimen.standard_tiny_padding) / resources.getDisplayMetrics().density;
            float dimension3 = resources.getDimension(R.dimen.layout_space_padding) / resources.getDisplayMetrics().density;
            int iApplyDimension = (int) TypedValue.applyDimension(1, dimension, resources.getDisplayMetrics());
            int iApplyDimension2 = (int) TypedValue.applyDimension(1, dimension2, resources.getDisplayMetrics());
            this.f112517c.setPadding(iApplyDimension, iApplyDimension2, iApplyDimension2, (int) TypedValue.applyDimension(1, dimension3, resources.getDisplayMetrics()));
            i14 = R.style.DSLInfoTextView;
        } else if (p005kotlin.jvm.internal.s.g(str, kVar.f118633a)) {
            i14 = R.style.DSLLinkTextView;
        } else if (p005kotlin.jvm.internal.s.g(str, mh2.k.DISCLOSURE.f118633a)) {
            i14 = R.style.DSLDisclosureTextView;
        } else {
            i14 = R.style.DSLHelpTextBody;
        }
        this.f112517c.setTextAppearance(i14);
        bVar.f93793c.f(fragment.getViewLifecycleOwner(), new z0() { // from class: lh2.l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj2) {
                int i15 = m.f112515d;
                ei2.h hVar2 = hVar;
                boolean z14 = hVar2 instanceof di2.b;
                ii2.b bVar2 = bVar;
                Map<String, ? extends Object> map2 = map;
                m mVar = this;
                if (z14) {
                    mVar.f112517c.setText(mVar.j(((di2.b) hVar2).b(hVar2.j(bVar2, map2)), arrayList));
                }
                mVar.i(bVar2, map2, null);
            }
        });
    }

    private final void setLinkClickListener(String url) {
        setOnClickListener(new hx0.k(27, url, this));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    public final SpannableStringBuilder j(String str, ArrayList<String> arrayList) {
        if (str.length() <= 0 || arrayList == null || arrayList.isEmpty()) {
            return new SpannableStringBuilder(str);
        }
        Iterator<String> it = arrayList.iterator();
        it.getClass();
        List<String> listW = w.W(str, new String[]{"<link>"});
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        for (String str2 : listW) {
            if (w.z(str2, "</link>", false)) {
                String string = spannableStringBuilder.toString();
                string.getClass();
                int length = string.length() > 0 ? spannableStringBuilder.toString().length() : 0;
                int iH = w.H(str2, "</link>", 0, false, 6) + length;
                spannableStringBuilder.append((CharSequence) d53.u.v(str2, "</link>", "", false));
                r0 r0Var = new r0();
                if (it.hasNext()) {
                    r0Var.f105810a = it.next();
                }
                spannableStringBuilder.setSpan(new a(r0Var), length, iH, 0);
            } else {
                spannableStringBuilder.append((CharSequence) str2);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f112516b = new hi2.d("InteractiveTextView", null, 2, null);
        View.inflate(context, R.layout.dsl_information_view, this);
        View viewFindViewById = findViewById(R.id.help_text_view);
        viewFindViewById.getClass();
        this.f112517c = (StyledTextView) viewFindViewById;
    }

    public /* synthetic */ m(Context context, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }
}
