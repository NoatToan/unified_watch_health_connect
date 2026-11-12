package cw2;

import aa2.p;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import ca0.j1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import cx2.h;
import d53.k;
import d53.w;
import e23.l;
import gw2.i;
import java.util.Arrays;
import java.util.Map;
import o13.g;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lcw2/c;", "Lfw2/a;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Ldx2/c;", "settingsViewModel", "Lcw2/f;", "transform", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Ldx2/c;Lcw2/f;Ljava/util/Map;)V", "defaultText", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends fw2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f56271d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f56272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StyledTextView f56273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f56274c;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f56275a;

        public a(l lVar) {
            lVar.getClass();
            this.f56275a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f56275a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f56275a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"cw2/c$b", "Landroid/text/style/ClickableSpan;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends ClickableSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f56277b;

        public b(String str) {
            this.f56277b = str;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            view2.getClass();
            int i14 = c.f56271d;
            c.this.l(this.f56277b);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Fragment fragment, dx2.c cVar, f fVar, Map<String, ? extends Object> map) {
        Map map2;
        String str;
        Map map3;
        String str2;
        Map map4;
        fragment.getClass();
        cVar.getClass();
        fVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        String str3 = null;
        this(contextRequireContext, (AttributeSet) (0 == true ? 1 : 0), 2, (j) (0 == true ? 1 : 0));
        Object obj = map.get(i.TEXT_OPTIONS.f79975a);
        try {
            map2 = (Map) (obj instanceof Map ? obj : null);
        } catch (ClassCastException unused) {
            map2 = null;
        }
        Object obj2 = map2 != null ? map2.get(i.STYLE.f79975a) : null;
        try {
            str = (String) (obj2 instanceof String ? obj2 : null);
        } catch (ClassCastException unused2) {
            str = null;
        }
        String string = (str == null || str.length() == 0) ? null : str.toString();
        Object obj3 = map.get(i.TEXT_OPTIONS.f79975a);
        try {
            map3 = (Map) (obj3 instanceof Map ? obj3 : null);
        } catch (ClassCastException unused3) {
            map3 = null;
        }
        Object obj4 = map3 != null ? map3.get(i.REDIRECT_URL.f79975a) : null;
        try {
            str2 = (String) (obj4 instanceof String ? obj4 : null);
        } catch (ClassCastException unused4) {
            str2 = null;
        }
        CharSequence charSequenceK = k(fVar, cVar, map, str2, string, this);
        String str4 = str2;
        if (charSequenceK.length() == 0) {
            this.f56272a.d(null, "Did not find the translation for Row ID: " + map.get(i.ROW_ID.f79975a));
            this.f56274c.setVisibility(8);
        } else {
            StyledTextView styledTextView = this.f56273b;
            styledTextView.setText(charSequenceK);
            if (charSequenceK instanceof SpannableString) {
                styledTextView.setMovementMethod(LinkMovementMethod.getInstance());
                styledTextView.setHighlightColor(0);
            }
        }
        if (s.g(string, "LINK")) {
            setOnClickListener(new cw2.b(0, this, str4));
        }
        int i14 = R.style.RTSHelpTextBody;
        if (string != null) {
            switch (string.hashCode()) {
                case -1820123910:
                    if (string.equals("TITLE2")) {
                        i14 = R.style.RTSHelpTextTitle2;
                    }
                    break;
                case -1277871080:
                    if (string.equals("SUBTITLE")) {
                        i14 = R.style.RTSHelpTextSubtitle;
                    }
                    break;
                case 2044322:
                    string.equals("BODY");
                    break;
                case 2251950:
                    if (string.equals("INFO")) {
                        i14 = R.style.RTSInfoTextView;
                    }
                    break;
                case 2336762:
                    if (string.equals("LINK")) {
                        i14 = R.style.RTSLinkTextView;
                    }
                    break;
                case 79833656:
                    if (string.equals("TITLE")) {
                        i14 = R.style.RTSHelpTextTitle;
                    }
                    break;
                case 1970362626:
                    if (string.equals("BULLET")) {
                        i14 = R.style.RTSHelpTextBullet;
                    }
                    break;
            }
        }
        this.f56273b.setTextAppearance(i14);
        StyledTextView styledTextView2 = this.f56273b;
        Object obj5 = map.get(i.TEXT_OPTIONS.f79975a);
        try {
            map4 = (Map) (obj5 instanceof Map ? obj5 : null);
        } catch (ClassCastException unused5) {
            map4 = null;
        }
        Object obj6 = map4 != null ? map4.get(i.GRAVITY.f79975a) : null;
        try {
            str3 = (String) (obj6 instanceof String ? obj6 : null);
        } catch (ClassCastException unused6) {
        }
        styledTextView2.setGravity(s.g(str3, "CENTER") ? 17 : 8388611);
        cVar.f61486c.f(fragment.getViewLifecycleOwner(), new a(new p(this, cVar, map, fVar, str4, string, 5)));
    }

    public static final CharSequence k(f fVar, dx2.c cVar, Map<String, ? extends Object> map, String str, String str2, c cVar2) {
        e eVar;
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        Object objF = cVar.f61484a.f(gw2.j.TEXT, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof e)) {
                objF = null;
            }
            eVar = (e) objF;
        } catch (ClassCastException unused) {
            eVar = null;
        }
        tv2.c cVar3 = eVar != null ? eVar.f56279a : null;
        String strB = cVar3 != null ? fVar.b(cVar3) : null;
        t tVarB = m.b(new j1(fVar, cVar, map));
        if (strB == null) {
            strB = (String) tVarB.getValue();
        }
        try {
            if (strB.length() == 0) {
                return "";
            }
            if (str == null) {
                if (!s.g(str2, "BULLET")) {
                    return strB;
                }
                x0 x0Var = x0.f105818a;
                String string2 = cVar2.getContext().getString(R.string.settings_bullet_placeholder);
                string2.getClass();
                return String.format(string2, Arrays.copyOf(new Object[]{strB}, 1));
            }
            d53.j jVarB = new k("<link>(.+)</link>").b(0, strB);
            if (jVarB == null) {
                throw new RuntimeException("No matched link.");
            }
            d53.h hVarB = jVarB.f57693c.b(1);
            if (hVarB == null) {
                throw new RuntimeException("Unexpected missing matched group.");
            }
            String str3 = hVarB.f57688a;
            int i14 = jVarB.b().f96796a;
            j23.l lVar = new j23.l(i14, str3.length() + i14);
            j23.l lVarB = jVarB.b();
            lVarB.getClass();
            SpannableString spannableString = new SpannableString(w.T(strB, str3, lVarB.f96796a, lVarB.f96797b + 1).toString());
            spannableString.setSpan(cVar2.new b(str), lVar.f96796a, lVar.f96797b, 33);
            return spannableString;
        } catch (Throwable th3) {
            h hVar = cVar2.f56272a;
            g.b(th3);
            hVar.getClass();
            return strB;
        }
    }

    public final void l(String str) {
        h hVar = this.f56272a;
        if (str != null) {
            hVar.getClass();
            getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } else {
            Logger logger = h.f56678c;
            hVar.getClass();
        }
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f56272a = new h("InformationView", null, 2, null);
        View.inflate(context, R.layout.rts_information_view, this);
        View viewFindViewById = findViewById(R.id.row_container_view);
        viewFindViewById.getClass();
        this.f56274c = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.help_text_view);
        viewFindViewById2.getClass();
        this.f56273b = (StyledTextView) viewFindViewById2;
    }
}
