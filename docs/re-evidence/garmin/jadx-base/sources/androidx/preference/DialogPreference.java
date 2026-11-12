package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import b7.j;
import bd.i;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence K0;
    public final String L0;
    public final Drawable M0;
    public final String N0;
    public final String O0;
    public final int P0;

    public interface a {
        Preference H0(String str);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f17509c, i14, i15);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.K0 = string;
        if (string == null) {
            this.K0 = this.f10154h;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.L0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.M0 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.N0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.O0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.P0 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void n() {
        androidx.fragment.app.i dVar;
        b bVar = this.f10148b.f17496i;
        if (bVar != null) {
            boolean zA = false;
            for (Fragment parentFragment = bVar; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof b.d) {
                    zA = ((b.d) parentFragment).a();
                }
            }
            if (!zA && (bVar.getContext() instanceof b.d)) {
                zA = ((b.d) bVar.getContext()).a();
            }
            if (!zA && (bVar.getActivity() instanceof b.d)) {
                zA = ((b.d) bVar.getActivity()).a();
            }
            if (!zA && bVar.getParentFragmentManager().G("androidx.preference.PreferenceFragment.DIALOG") == null) {
                if (this instanceof EditTextPreference) {
                    String str = this.f10159l;
                    dVar = new bd.a();
                    Bundle bundle = new Bundle(1);
                    bundle.putString(Action.KEY_ATTRIBUTE, str);
                    dVar.setArguments(bundle);
                } else if (this instanceof ListPreference) {
                    String str2 = this.f10159l;
                    dVar = new bd.c();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString(Action.KEY_ATTRIBUTE, str2);
                    dVar.setArguments(bundle2);
                } else {
                    if (!(this instanceof MultiSelectListPreference)) {
                        e.r("Cannot display dialog for an unknown Preference type: ", getClass().getSimpleName(), ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                        return;
                    }
                    String str3 = this.f10159l;
                    dVar = new bd.d();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putString(Action.KEY_ATTRIBUTE, str3);
                    dVar.setArguments(bundle3);
                }
                dVar.setTargetFragment(bVar, 0);
                dVar.show(bVar.getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
            }
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle, context));
    }

    public DialogPreference(Context context) {
        this(context, null);
    }
}
