package lc;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@v0.a("activity")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Llc/a;", "Llc/v0;", "Llc/a$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "a", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class a extends v0<b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f111714e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f111715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f111716d;

    static {
        new C2141a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f111715c = context;
        for (Object obj : c53.q.e(new l72.b1(6), context)) {
            if (((Context) obj) instanceof Activity) {
                this.f111716d = (Activity) obj;
            }
        }
        obj = null;
        this.f111716d = (Activity) obj;
    }

    @Override // lc.v0
    public final h0 a() {
        return new b(this);
    }

    @Override // lc.v0
    public final h0 c(h0 h0Var, Bundle bundle, o0 o0Var) {
        Intent intent;
        int intExtra;
        b bVar = (b) h0Var;
        qc.j jVar = bVar.f111773b;
        if (bVar.f111717g == null) {
            v.e0.n(am.j.q(new StringBuilder("Destination "), jVar.f144346e, " does not have an Intent set."));
            return null;
        }
        Intent intent2 = new Intent(bVar.f111717g);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = bVar.f111718h;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    if (!bundle.containsKey(strGroup)) {
                        kg.f.m(strGroup, "Could not find ", " in ", bundle, " to fill data pattern ", str);
                        return null;
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    t tVar = bVar.e().get(strGroup);
                    q0<Object> q0Var = tVar != null ? tVar.f111866a : null;
                    stringBuffer.append(q0Var != null ? q0Var.f(q0Var.a(bundle, strGroup)) : Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f111716d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (o0Var != null && o0Var.f111804a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", jVar.f144346e);
        Context context = this.f111715c;
        Resources resources = context.getResources();
        if (o0Var != null) {
            int i14 = o0Var.f111811h;
            int i15 = o0Var.f111812i;
            if ((i14 <= 0 || !p005kotlin.jvm.internal.s.g(resources.getResourceTypeName(i14), "animator")) && (i15 <= 0 || !p005kotlin.jvm.internal.s.g(resources.getResourceTypeName(i15), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i14);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i15).getClass();
            } else {
                resources.getResourceName(i14);
                resources.getResourceName(i15);
                bVar.toString();
            }
        }
        context.startActivity(intent2);
        if (o0Var != null && activity != null) {
            int i16 = o0Var.f111809f;
            int i17 = o0Var.f111810g;
            if ((i16 > 0 && p005kotlin.jvm.internal.s.g(resources.getResourceTypeName(i16), "animator")) || (i17 > 0 && p005kotlin.jvm.internal.s.g(resources.getResourceTypeName(i17), "animator"))) {
                resources.getResourceName(i16);
                resources.getResourceName(i17);
                bVar.toString();
                return null;
            }
            if (i16 >= 0 || i17 >= 0) {
                if (i16 < 0) {
                    i16 = 0;
                }
                activity.overridePendingTransition(i16, i17 >= 0 ? i17 : 0);
            }
        }
        return null;
    }

    @Override // lc.v0
    public final boolean j() {
        Activity activity = this.f111716d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* JADX INFO: renamed from: lc.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Llc/a$a;", "", "<init>", "()V", "", "EXTRA_NAV_SOURCE", "Ljava/lang/String;", "EXTRA_NAV_CURRENT", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2141a {
        public /* synthetic */ C2141a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2141a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Llc/a$b;", "Llc/h0;", "Llc/v0;", "activityNavigator", "<init>", "(Llc/v0;)V", "Llc/w0;", "navigatorProvider", "(Llc/w0;)V", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class b extends h0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Intent f111717g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f111718h;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(w0 w0Var) {
            this((v0<? extends b>) w0Var.b(a.class));
            w0Var.getClass();
        }

        public static String m(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            packageName.getClass();
            return d53.u.v(str, "${applicationId}", packageName, false);
        }

        @Override // lc.h0
        public final boolean equals(Object obj) {
            boolean zFilterEquals;
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b) && super.equals(obj)) {
                Intent intent = this.f111717g;
                if (intent != null) {
                    zFilterEquals = intent.filterEquals(((b) obj).f111717g);
                } else {
                    zFilterEquals = ((b) obj).f111717g == null;
                }
                if (zFilterEquals && p005kotlin.jvm.internal.s.g(this.f111718h, ((b) obj).f111718h)) {
                    return true;
                }
            }
            return false;
        }

        @Override // lc.h0
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.f111717g;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f111718h;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // lc.h0
        public final void i(Context context, AttributeSet attributeSet) {
            super.i(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, z0.f111918a);
            typedArrayObtainAttributes.getClass();
            String strM = m(context, typedArrayObtainAttributes.getString(4));
            if (this.f111717g == null) {
                this.f111717g = new Intent();
            }
            Intent intent = this.f111717g;
            intent.getClass();
            intent.setPackage(strM);
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                ComponentName componentName = new ComponentName(context, string);
                if (this.f111717g == null) {
                    this.f111717g = new Intent();
                }
                Intent intent2 = this.f111717g;
                intent2.getClass();
                intent2.setComponent(componentName);
            }
            String string2 = typedArrayObtainAttributes.getString(1);
            if (this.f111717g == null) {
                this.f111717g = new Intent();
            }
            Intent intent3 = this.f111717g;
            intent3.getClass();
            intent3.setAction(string2);
            String strM2 = m(context, typedArrayObtainAttributes.getString(2));
            if (strM2 != null) {
                Uri uri = Uri.parse(strM2);
                if (this.f111717g == null) {
                    this.f111717g = new Intent();
                }
                Intent intent4 = this.f111717g;
                intent4.getClass();
                intent4.setData(uri);
            }
            this.f111718h = m(context, typedArrayObtainAttributes.getString(3));
            typedArrayObtainAttributes.recycle();
        }

        @Override // lc.h0
        public final String toString() {
            Intent intent = this.f111717g;
            ComponentName component = intent != null ? intent.getComponent() : null;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(super.toString());
            if (component != null) {
                sb3.append(" class=");
                sb3.append(component.getClassName());
            } else {
                Intent intent2 = this.f111717g;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action != null) {
                    sb3.append(" action=");
                    sb3.append(action);
                }
            }
            return sb3.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v0<? extends b> v0Var) {
            super(v0Var);
            v0Var.getClass();
        }
    }
}
