package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import b7.j;
import bd.i;
import com.garmin.android.apps.connectmobile.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.WeakHashMap;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public final boolean A;
    public final boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final boolean F;
    public e H0;
    public final boolean I;
    public f I0;
    public final a J0;
    public int P;
    public int T;
    public androidx.preference.c X;
    public ArrayList Y;
    public PreferenceGroup Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bd.f f10148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f10151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f10152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f10154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f10155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f10157k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f10158k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f10159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Intent f10160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f10161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f10162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f10164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10165r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f10166t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f10167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f10168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10169x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10170y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10171z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Preference.this.t(view2);
        }
    }

    public interface c {
        boolean f(Preference preference, Object obj);
    }

    public interface d {
        boolean X3(Preference preference);
    }

    public static class e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Preference f10173a;

        public e(Preference preference) {
            this.f10173a = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public final void onCreateContextMenu(ContextMenu contextMenu, View view2, ContextMenu.ContextMenuInfo contextMenuInfo) {
            Preference preference = this.f10173a;
            CharSequence charSequenceG = preference.g();
            if (!preference.F || TextUtils.isEmpty(charSequenceG)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceG);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Preference preference = this.f10173a;
            ClipboardManager clipboardManager = (ClipboardManager) preference.f10147a.getSystemService("clipboard");
            CharSequence charSequenceG = preference.g();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceG));
            Context context = preference.f10147a;
            Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceG), 0).show();
            return true;
        }
    }

    public interface f<T extends Preference> {
        CharSequence a(T t7);
    }

    public Preference(Context context, AttributeSet attributeSet, int i14, int i15) {
        this.f10153g = Integer.MAX_VALUE;
        this.f10163p = true;
        this.f10164q = true;
        this.f10166t = true;
        this.f10169x = true;
        this.f10170y = true;
        this.f10171z = true;
        this.A = true;
        this.B = true;
        this.D = true;
        this.I = true;
        this.P = R.layout.preference;
        this.J0 = new a();
        this.f10147a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f17513g, i14, i15);
        this.f10156j = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f10159l = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f10154h = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f10155i = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f10153g = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f10161n = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.P = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.T = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f10163p = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f10164q = z14;
        this.f10166t = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.f10167v = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.A = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z14));
        this.B = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z14));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f10168w = p(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f10168w = p(typedArrayObtainStyledAttributes, 11);
        }
        this.I = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.C = zHasValue;
        if (zHasValue) {
            this.D = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.E = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.f10171z = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.F = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void v(View view2, boolean z14) {
        view2.setEnabled(z14);
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                v(viewGroup.getChildAt(childCount), z14);
            }
        }
    }

    public final void A(boolean z14) {
        if (this.f10171z != z14) {
            this.f10171z = z14;
            androidx.preference.c cVar = this.X;
            if (cVar != null) {
                Handler handler = cVar.f10210e;
                androidx.preference.c.a aVar = cVar.f10211f;
                handler.removeCallbacks(aVar);
                handler.post(aVar);
            }
        }
    }

    public boolean B() {
        return !h();
    }

    public final boolean C() {
        return (this.f10148b == null || !this.f10166t || TextUtils.isEmpty(this.f10159l)) ? false : true;
    }

    public final void D() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.f10167v;
        if (str != null) {
            bd.f fVar = this.f10148b;
            Preference preferenceF = null;
            if (fVar != null && (preferenceScreen = fVar.f17494g) != null) {
                preferenceF = preferenceScreen.F(str);
            }
            if (preferenceF == null || (arrayList = preferenceF.Y) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public final boolean a(Serializable serializable) {
        c cVar = this.f10151e;
        return cVar == null || cVar.f(this, serializable);
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        if (TextUtils.isEmpty(this.f10159l) || (parcelable = bundle.getParcelable(this.f10159l)) == null) {
            return;
        }
        this.f10158k0 = false;
        q(parcelable);
        if (this.f10158k0) {
            return;
        }
        h.z("Derived class did not call super.onRestoreInstanceState()");
    }

    public void c(Bundle bundle) {
        if (TextUtils.isEmpty(this.f10159l)) {
            return;
        }
        this.f10158k0 = false;
        Parcelable parcelableR = r();
        if (!this.f10158k0) {
            h.z("Derived class did not call super.onSaveInstanceState()");
        } else if (parcelableR != null) {
            bundle.putParcelable(this.f10159l, parcelableR);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i14 = this.f10153g;
        int i15 = preference2.f10153g;
        if (i14 != i15) {
            return i14 - i15;
        }
        CharSequence charSequence = this.f10154h;
        CharSequence charSequence2 = preference2.f10154h;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f10154h.toString());
    }

    public long d() {
        return this.f10149c;
    }

    public final String e(String str) {
        return !C() ? str : this.f10148b.d().getString(this.f10159l, str);
    }

    public final SharedPreferences f() {
        bd.f fVar = this.f10148b;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    public CharSequence g() {
        f fVar = this.I0;
        return fVar != null ? fVar.a(this) : this.f10155i;
    }

    public boolean h() {
        return this.f10163p && this.f10169x && this.f10170y;
    }

    public void i() {
        int iIndexOf;
        androidx.preference.c cVar = this.X;
        if (cVar == null || (iIndexOf = cVar.f10208c.indexOf(this)) == -1) {
            return;
        }
        cVar.notifyItemChanged(iIndexOf, this);
    }

    public void j(boolean z14) {
        ArrayList arrayList = this.Y;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            Preference preference = (Preference) arrayList.get(i14);
            if (preference.f10169x == z14) {
                preference.f10169x = !z14;
                preference.j(preference.B());
                preference.i();
            }
        }
    }

    public void k() {
        PreferenceScreen preferenceScreen;
        String str = this.f10167v;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bd.f fVar = this.f10148b;
        Preference preferenceF = null;
        if (fVar != null && (preferenceScreen = fVar.f17494g) != null) {
            preferenceF = preferenceScreen.F(str);
        }
        if (preferenceF == null) {
            StringBuilder sbL = hb.a.l("Dependency \"", str, "\" not found for preference \"");
            sbL.append(this.f10159l);
            sbL.append("\" (title: \"");
            o2.c.t(sbL, this.f10154h, "\"");
            return;
        }
        if (preferenceF.Y == null) {
            preferenceF.Y = new ArrayList();
        }
        preferenceF.Y.add(this);
        boolean zB = preferenceF.B();
        if (this.f10169x == zB) {
            this.f10169x = !zB;
            j(B());
            i();
        }
    }

    public final void l(bd.f fVar) {
        long j8;
        this.f10148b = fVar;
        if (!this.f10150d) {
            synchronized (fVar) {
                j8 = fVar.f17489b;
                fVar.f17489b = 1 + j8;
            }
            this.f10149c = j8;
        }
        if (C() && f().contains(this.f10159l)) {
            s(null);
            return;
        }
        Object obj = this.f10168w;
        if (obj != null) {
            s(obj);
        }
    }

    public void m(bd.h hVar) {
        Integer numValueOf;
        View view2 = hVar.itemView;
        view2.setOnClickListener(this.J0);
        view2.setId(0);
        TextView textView = (TextView) hVar.d(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceG = g();
            if (TextUtils.isEmpty(charSequenceG)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceG);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) hVar.d(android.R.id.title);
        boolean z14 = this.f10164q;
        if (textView2 != null) {
            CharSequence charSequence = this.f10154h;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.C) {
                    textView2.setSingleLine(this.D);
                }
                if (!z14 && h() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) hVar.d(android.R.id.icon);
        if (imageView != null) {
            int i14 = this.f10156j;
            if (i14 != 0 || this.f10157k != null) {
                if (this.f10157k == null) {
                    this.f10157k = j.a.a(this.f10147a, i14);
                }
                Drawable drawable = this.f10157k;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f10157k != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.E ? 4 : 8);
            }
        }
        View viewD = hVar.d(R.id.icon_frame);
        if (viewD == null) {
            viewD = hVar.d(android.R.id.icon_frame);
        }
        if (viewD != null) {
            if (this.f10157k != null) {
                viewD.setVisibility(0);
            } else {
                viewD.setVisibility(this.E ? 4 : 8);
            }
        }
        if (this.I) {
            v(view2, h());
        } else {
            v(view2, true);
        }
        view2.setFocusable(z14);
        view2.setClickable(z14);
        hVar.f17505d = this.A;
        hVar.f17506e = this.B;
        boolean z15 = this.F;
        if (z15 && this.H0 == null) {
            this.H0 = new e(this);
        }
        view2.setOnCreateContextMenuListener(z15 ? this.H0 : null);
        view2.setLongClickable(z15);
        if (!z15 || z14) {
            return;
        }
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        view2.setBackground(null);
    }

    public void n() {
    }

    public void o() {
        D();
    }

    public Object p(TypedArray typedArray, int i14) {
        return null;
    }

    public void q(Parcelable parcelable) {
        this.f10158k0 = true;
        if (parcelable == AbsSavedState.EMPTY_STATE || parcelable == null) {
            return;
        }
        h.s("Wrong state class -- expecting Preference State");
    }

    public Parcelable r() {
        this.f10158k0 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void s(Object obj) {
    }

    public void t(View view2) {
        Fragment fragment;
        if (h() && this.f10164q) {
            n();
            d dVar = this.f10152f;
            if (dVar == null || !dVar.X3(this)) {
                bd.f fVar = this.f10148b;
                if (fVar != null && (fragment = fVar.f17495h) != null) {
                    String str = this.f10161n;
                    boolean z14 = false;
                    if (str != null) {
                        boolean zA = false;
                        for (Fragment parentFragment = fragment; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                            if (parentFragment instanceof androidx.preference.b.e) {
                                zA = ((androidx.preference.b.e) parentFragment).a();
                            }
                        }
                        if (!zA && (fragment.getContext() instanceof androidx.preference.b.e)) {
                            zA = ((androidx.preference.b.e) fragment.getContext()).a();
                        }
                        if (!zA && (fragment.getActivity() instanceof androidx.preference.b.e)) {
                            zA = ((androidx.preference.b.e) fragment.getActivity()).a();
                        }
                        if (!zA) {
                            v parentFragmentManager = fragment.getParentFragmentManager();
                            if (this.f10162o == null) {
                                this.f10162o = new Bundle();
                            }
                            Bundle bundle = this.f10162o;
                            Fragment fragmentInstantiate = parentFragmentManager.P().instantiate(fragment.requireActivity().getClassLoader(), str);
                            fragmentInstantiate.setArguments(bundle);
                            fragmentInstantiate.setTargetFragment(fragment, 0);
                            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
                            aVar.l(((View) fragment.requireView().getParent()).getId(), fragmentInstantiate, null);
                            aVar.d(null);
                            aVar.e();
                        }
                        z14 = true;
                    }
                    if (z14) {
                        return;
                    }
                }
                Intent intent = this.f10160m;
                if (intent != null) {
                    this.f10147a.startActivity(intent);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        CharSequence charSequence = this.f10154h;
        if (!TextUtils.isEmpty(charSequence)) {
            sb3.append(charSequence);
            sb3.append(' ');
        }
        CharSequence charSequenceG = g();
        if (!TextUtils.isEmpty(charSequenceG)) {
            sb3.append(charSequenceG);
            sb3.append(' ');
        }
        if (sb3.length() > 0) {
            sb3.setLength(sb3.length() - 1);
        }
        return sb3.toString();
    }

    public final void u(String str) {
        if (C() && !TextUtils.equals(str, e(null))) {
            SharedPreferences.Editor editorC = this.f10148b.c();
            editorC.putString(this.f10159l, str);
            if (this.f10148b.f17492e) {
                return;
            }
            editorC.apply();
        }
    }

    public final void w(String str) {
        this.f10159l = str;
        if (this.f10165r && TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.f10159l)) {
                h.z("Preference does not have a key assigned.");
            } else {
                this.f10165r = true;
            }
        }
    }

    public final void x(int i14) {
        y(this.f10147a.getString(i14));
    }

    public void y(CharSequence charSequence) {
        if (this.I0 != null) {
            h.z("Preference already has a SummaryProvider set.");
        } else {
            if (TextUtils.equals(this.f10155i, charSequence)) {
                return;
            }
            this.f10155i = charSequence;
            i();
        }
    }

    public final void z(String str) {
        if (TextUtils.equals(str, this.f10154h)) {
            return;
        }
        this.f10154h = str;
        i();
    }

    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(R.attr.preferenceStyle, android.R.attr.preferenceStyle, context));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
