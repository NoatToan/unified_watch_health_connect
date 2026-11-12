package com.garmin.android.apps.connectmobile.view.reusablecomponents;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.NumberPicker;
import c32.c;
import c32.d;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import java.util.ArrayList;
import java.util.Arrays;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.y;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u000fBC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/a;", "Lc32/d;", "T", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/a$a;", "data", "Lkotlin/Function0;", "", "onDismissed", "Lkotlin/Function1;", "onChanged", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/a$a;Le23/a;Le23/l;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"InflateParams"})
public class a<T extends d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0929a<T> f47692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.a f47693b;

    public a(Context context, C0929a<T> c0929a, e23.a<Unit> aVar, l<? super T, Unit> lVar) {
        String string;
        context.getClass();
        c0929a.getClass();
        lVar.getClass();
        this.f47692a = c0929a;
        t tVarB = m.b(new a42.d(context, 20));
        this.f47693b = new a12.a(lVar, 16);
        d32.b.f57388a.getClass();
        if (d32.b.f57389b == null) {
            synchronized (d32.b.class) {
                try {
                    if (d32.b.f57389b == null) {
                        d32.b.f57389b = new d32.b(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        d32.b bVar = d32.b.f57389b;
        bVar.getClass();
        bVar.setTitle(c0929a.f47694a);
        Object value = tVarB.getValue();
        value.getClass();
        bVar.setView((View) value);
        bVar.setCancelable(!c0929a.f47695b);
        ArrayList<d> arrayList = new ArrayList();
        d0.w(arrayList, c0929a.f47696c);
        Object value2 = tVarB.getValue();
        value2.getClass();
        NumberPicker numberPicker = (NumberPicker) ((View) value2).findViewById(R.id.generic_list_picker);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(arrayList.size() - 1);
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        for (d dVar : arrayList) {
            if (dVar != null) {
                string = dVar.a(context);
            } else {
                string = context.getString(R.string.no_value);
                string.getClass();
            }
            arrayList2.add(string);
        }
        numberPicker.setDisplayedValues((String[]) arrayList2.toArray(new String[0]));
        numberPicker.setValue(arrayList.indexOf(this.f47692a.f47697d));
        if (this.f47692a.f47695b) {
            bVar.setNegativeButton(R.string.common_cancel, new c32.a(aVar, 0));
        } else {
            bVar.setOnCancelListener(new c32.b(aVar, 0));
        }
        bVar.setPositiveButton(R.string.common_button_done, new c(this, arrayList, numberPicker, aVar, 0));
        bVar.show();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.view.reusablecomponents.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/a$a;", "Lc32/d;", "T", "", "", "title", "", "shouldShowCancelBtn", "", "list", "initialValue", "<init>", "(Ljava/lang/String;Z[Lc32/d;Lc32/d;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0929a<T extends d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f47695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T[] f47696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final T f47697d;

        public C0929a(String str, boolean z14, T[] tArr, T t7) {
            str.getClass();
            tArr.getClass();
            this.f47694a = str;
            this.f47695b = z14;
            this.f47696c = tArr;
            this.f47697d = t7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0929a)) {
                return false;
            }
            C0929a c0929a = (C0929a) obj;
            return s.g(this.f47694a, c0929a.f47694a) && this.f47695b == c0929a.f47695b && s.g(this.f47696c, c0929a.f47696c) && s.g(this.f47697d, c0929a.f47697d);
        }

        public final int hashCode() {
            int iG = (f.g(this.f47694a.hashCode() * 31, 31, this.f47695b) + Arrays.hashCode(this.f47696c)) * 31;
            T t7 = this.f47697d;
            return iG + (t7 == null ? 0 : t7.hashCode());
        }

        public final String toString() {
            String string = Arrays.toString(this.f47696c);
            StringBuilder sbD = zl.a.d("Params(title=", this.f47694a, ", shouldShowCancelBtn=", this.f47695b, ", list=");
            sbD.append(string);
            sbD.append(", initialValue=");
            sbD.append(this.f47697d);
            sbD.append(")");
            return sbD.toString();
        }

        public /* synthetic */ C0929a(String str, boolean z14, d[] dVarArr, d dVar, int i14, j jVar) {
            this(str, (i14 & 2) != 0 ? false : z14, dVarArr, dVar);
        }
    }

    public /* synthetic */ a(Context context, C0929a c0929a, e23.a aVar, l lVar, int i14, j jVar) {
        this(context, c0929a, (i14 & 4) != 0 ? null : aVar, lVar);
    }
}
