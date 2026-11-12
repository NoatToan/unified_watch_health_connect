package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.hn0;
import defpackage.x5j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
@i.b(LifecycleConstantKt.TYPE_ACTIVITY)
public class a extends i<C0045a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f2657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f2658b;

    /* JADX INFO: renamed from: androidx.navigation.a$a, reason: collision with other inner class name */
    public static class C0045a extends d {
        public Intent j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f2659k;

        public C0045a(i<? extends C0045a> iVar) {
            super(iVar);
        }

        @Override // androidx.navigation.d
        public boolean A() {
            return false;
        }

        public final String B() {
            Intent intent = this.j;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        public final ComponentName C() {
            Intent intent = this.j;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        public final String E() {
            return this.f2659k;
        }

        public final Intent F() {
            return this.j;
        }

        public final C0045a G(String str) {
            if (this.j == null) {
                this.j = new Intent();
            }
            this.j.setAction(str);
            return this;
        }

        public final C0045a H(ComponentName componentName) {
            if (this.j == null) {
                this.j = new Intent();
            }
            this.j.setComponent(componentName);
            return this;
        }

        public final C0045a I(Uri uri) {
            if (this.j == null) {
                this.j = new Intent();
            }
            this.j.setData(uri);
            return this;
        }

        public final C0045a L(String str) {
            this.f2659k = str;
            return this;
        }

        public final C0045a P(String str) {
            if (this.j == null) {
                this.j = new Intent();
            }
            this.j.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.d
        public String toString() {
            ComponentName componentNameC = C();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (componentNameC != null) {
                sb.append(" class=");
                sb.append(componentNameC.getClassName());
            } else {
                String strB = B();
                if (strB != null) {
                    sb.append(" action=");
                    sb.append(strB);
                }
            }
            return sb.toString();
        }

        @Override // androidx.navigation.d
        public void u(Context context, AttributeSet attributeSet) {
            super.u(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, x5j.f38726a);
            String string = typedArrayObtainAttributes.getString(x5j.f);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            P(string);
            String string2 = typedArrayObtainAttributes.getString(x5j.f38727b);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                H(new ComponentName(context, string2));
            }
            G(typedArrayObtainAttributes.getString(x5j.c));
            String string3 = typedArrayObtainAttributes.getString(x5j.d);
            if (string3 != null) {
                I(Uri.parse(string3));
            }
            L(typedArrayObtainAttributes.getString(x5j.e));
            typedArrayObtainAttributes.recycle();
        }
    }

    public static final class b implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hn0 f2661b;

        /* JADX INFO: renamed from: androidx.navigation.a$b$a, reason: collision with other inner class name */
        public static final class C0046a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2662a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public hn0 f2663b;

            public C0046a a(int i) {
                this.f2662a = i | this.f2662a;
                return this;
            }

            public b b() {
                return new b(this.f2662a, this.f2663b);
            }

            public C0046a c(hn0 hn0Var) {
                return this;
            }
        }

        public b(int i, hn0 hn0Var) {
            this.f2660a = i;
        }

        public hn0 a() {
            return this.f2661b;
        }

        public int b() {
            return this.f2660a;
        }
    }

    public a(Context context) {
        this.f2657a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f2658b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    @Override // androidx.navigation.i
    public boolean e() {
        Activity activity = this.f2658b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.navigation.i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0045a a() {
        return new C0045a(this);
    }

    public final Context g() {
        return this.f2657a;
    }

    @Override // androidx.navigation.i
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d b(C0045a c0045a, Bundle bundle, h hVar, i.a aVar) {
        Intent intent;
        int intExtra;
        if (c0045a.F() == null) {
            throw new IllegalStateException("Destination " + c0045a.m() + " does not have an Intent set.");
        }
        Intent intent2 = new Intent(c0045a.F());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String strE = c0045a.E();
            if (!TextUtils.isEmpty(strE)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strE);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + strE);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(bundle.get(strGroup).toString()));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z = aVar instanceof b;
        if (z) {
            intent2.addFlags(((b) aVar).b());
        }
        if (!(this.f2657a instanceof Activity)) {
            intent2.addFlags(268435456);
        }
        if (hVar != null && hVar.g()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.f2658b;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c0045a.m());
        Resources resources = g().getResources();
        if (hVar != null) {
            int iC = hVar.c();
            int iD = hVar.d();
            if ((iC <= 0 || !resources.getResourceTypeName(iC).equals("animator")) && (iD <= 0 || !resources.getResourceTypeName(iD).equals("animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", iC);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", iD);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity destinations do not support Animator resource. Ignoring popEnter resource ");
                sb.append(resources.getResourceName(iC));
                sb.append(" and popExit resource ");
                sb.append(resources.getResourceName(iD));
                sb.append("when launching ");
                sb.append(c0045a);
            }
        }
        if (z) {
            ((b) aVar).a();
            this.f2657a.startActivity(intent2);
        } else {
            this.f2657a.startActivity(intent2);
        }
        if (hVar == null || this.f2658b == null) {
            return null;
        }
        int iA = hVar.a();
        int iB = hVar.b();
        if ((iA <= 0 || !resources.getResourceTypeName(iA).equals("animator")) && (iB <= 0 || !resources.getResourceTypeName(iB).equals("animator"))) {
            if (iA < 0 && iB < 0) {
                return null;
            }
            this.f2658b.overridePendingTransition(Math.max(iA, 0), Math.max(iB, 0));
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Activity destinations do not support Animator resource. Ignoring enter resource ");
        sb2.append(resources.getResourceName(iA));
        sb2.append(" and exit resource ");
        sb2.append(resources.getResourceName(iB));
        sb2.append("when launching ");
        sb2.append(c0045a);
        return null;
    }
}
