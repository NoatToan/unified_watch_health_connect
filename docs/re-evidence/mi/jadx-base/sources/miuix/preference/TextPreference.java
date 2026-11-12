package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import defpackage.d3j;
import defpackage.dti;
import defpackage.eii;
import defpackage.g7i;
import defpackage.gwi;
import defpackage.imi;
import defpackage.n5j;
import defpackage.s6g;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import miuix.flexible.template.IHyperCellTemplate;
import miuix.flexible.view.HyperCellLayout;
import miuix.preference.flexible.AbstractBaseTemplate;

/* JADX INFO: loaded from: classes3.dex */
public class TextPreference extends BasePreference {
    public CharSequence e;
    public int f;
    public a g;

    public interface a<T extends TextPreference> {
        CharSequence a(T t);
    }

    public TextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.A2, i, i2);
        CharSequence text = typedArrayObtainStyledAttributes.getText(n5j.B2);
        String string = typedArrayObtainStyledAttributes.getString(n5j.C2);
        typedArrayObtainStyledAttributes.recycle();
        if (!TextUtils.isEmpty(text)) {
            p(text.toString());
        }
        r(m(context, string));
    }

    public final void l(TextView textView) {
        boolean z = false;
        boolean z2 = s6g.f(getContext()) == 2;
        if (getLayoutResource() == gwi.e && getWidgetLayoutResource() == gwi.h) {
            z = true;
        }
        int dimensionPixelOffset = z2 ? Integer.MAX_VALUE : getContext().getResources().getDimensionPixelOffset(imi.h);
        int i = z2 ? 5 : 6;
        if (z) {
            textView.setTextAlignment(i);
            textView.setMaxWidth(dimensionPixelOffset);
        }
    }

    public final a m(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(a.class).getConstructor(new Class[0]);
            constructor.setAccessible(true);
            return (a) constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Can't find provider: " + str, e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Can't access non-public constructor " + str, e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException("Could not instantiate the TextProvider: " + str, e3);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException("Error creating TextProvider " + str, e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException("Could not instantiate the TextProvider: " + str, e5);
        }
    }

    public CharSequence n() {
        return o() != null ? o().a(this) : this.e;
    }

    public final a o() {
        return this.g;
    }

    @Override // miuix.preference.BasePreference, androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        View view = g7iVar.itemView;
        TextView textView = (TextView) view.findViewById(dti.o);
        if (textView != null) {
            int visibility = textView.getVisibility();
            CharSequence charSequenceN = n();
            if (TextUtils.isEmpty(charSequenceN)) {
                textView.setVisibility(8);
            } else {
                l(textView);
                textView.setText(charSequenceN);
                textView.setVisibility(0);
            }
            if (visibility == textView.getVisibility() || !(view instanceof HyperCellLayout)) {
                return;
            }
            IHyperCellTemplate template = ((HyperCellLayout) view).getTemplate();
            if (template instanceof AbstractBaseTemplate) {
                ((AbstractBaseTemplate) template).refreshLayout((ViewGroup) view);
            }
        }
    }

    public void p(String str) {
        if (o() != null) {
            throw new IllegalStateException("Preference already has a TextProvider set.");
        }
        if (TextUtils.equals(str, this.e)) {
            return;
        }
        this.f = 0;
        this.e = str;
        notifyChanged();
    }

    public final void r(a aVar) {
        this.g = aVar;
        notifyChanged();
    }

    public TextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, d3j.d);
    }

    public TextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.F);
    }

    public TextPreference(Context context) {
        this(context, null);
    }
}
