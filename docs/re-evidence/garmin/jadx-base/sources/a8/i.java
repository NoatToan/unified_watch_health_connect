package a8;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class i extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f1916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1917b;

    public static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f1918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f1919b = new AtomicInteger(0);

        public a(Object obj) {
            this.f1918a = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f1918a).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            ((TextWatcher) this.f1918a).beforeTextChanged(charSequence, i14, i15, i16);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i14, int i15) {
            if (this.f1919b.get() <= 0 || !(obj instanceof g)) {
                ((SpanWatcher) this.f1918a).onSpanAdded(spannable, obj, i14, i15);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i14, int i15, int i16, int i17) {
            if (this.f1919b.get() <= 0 || !(obj instanceof g)) {
                ((SpanWatcher) this.f1918a).onSpanChanged(spannable, obj, i14, i15, i16, i17);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i14, int i15) {
            if (this.f1919b.get() <= 0 || !(obj instanceof g)) {
                ((SpanWatcher) this.f1918a).onSpanRemoved(spannable, obj, i14, i15);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            ((TextWatcher) this.f1918a).onTextChanged(charSequence, i14, i15, i16);
        }
    }

    public i(Class<?> cls) {
        this.f1917b = new ArrayList();
        k7.h.e(cls, "watcherClass cannot be null");
        this.f1916a = cls;
    }

    public final void a() {
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f1917b;
            if (i14 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i14)).f1919b.incrementAndGet();
            i14++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f1917b;
            if (i14 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i14)).onTextChanged(this, 0, length(), length());
            i14++;
        }
    }

    public final a c(Object obj) {
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f1917b;
            if (i14 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i14);
            if (aVar.f1918a == obj) {
                return aVar;
            }
            i14++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f1916a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i14, int i15) {
        super.delete(i14, i15);
        return this;
    }

    public final void e() {
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f1917b;
            if (i14 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i14)).f1919b.decrementAndGet();
            i14++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        a aVarC;
        if (d(obj) && (aVarC = c(obj)) != null) {
            obj = aVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        a aVarC;
        if (d(obj) && (aVarC = c(obj)) != null) {
            obj = aVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        a aVarC;
        if (d(obj) && (aVarC = c(obj)) != null) {
            obj = aVarC;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i14, int i15, Class<T> cls) {
        if (this.f1916a != cls) {
            return (T[]) super.getSpans(i14, i15, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i14, i15, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i16 = 0; i16 < aVarArr.length; i16++) {
            tArr[i16] = aVarArr[i16].f1918a;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i14, CharSequence charSequence) {
        super.insert(i14, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i14, int i15, Class cls) {
        if (cls == null || this.f1916a == cls) {
            cls = a.class;
        }
        return super.nextSpanTransition(i14, i15, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        a aVarC;
        if (d(obj)) {
            aVarC = c(obj);
            if (aVarC != null) {
                obj = aVarC;
            }
        } else {
            aVarC = null;
        }
        super.removeSpan(obj);
        if (aVarC != null) {
            this.f1917b.remove(aVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i14, int i15, CharSequence charSequence, int i16, int i17) {
        a();
        super.replace(i14, i15, charSequence, i16, i17);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i14, int i15, int i16) {
        if (d(obj)) {
            a aVar = new a(obj);
            this.f1917b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i14, i15, i16);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i14, int i15) {
        return new i(this.f1916a, this, i14, i15);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder delete(int i14, int i15) {
        super.delete(i14, i15);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i14, CharSequence charSequence) {
        super.insert(i14, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i14, CharSequence charSequence, int i15, int i16) {
        super.insert(i14, charSequence, i15, i16);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c14) {
        super.append(c14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i14, CharSequence charSequence, int i15, int i16) {
        super.insert(i14, charSequence, i15, i16);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c14) {
        super.append(c14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c14) {
        super.append(c14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i14, int i15) {
        super.append(charSequence, i14, i15);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i14, int i15) {
        super.append(charSequence, i14, i15);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i14, int i15) {
        super.append(charSequence, i14, i15);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i14, int i15, CharSequence charSequence, int i16, int i17) {
        replace(i14, i15, charSequence, i16, i17);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i14) {
        super.append(charSequence, obj, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i14, int i15, CharSequence charSequence) {
        a();
        super.replace(i14, i15, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i14, int i15, CharSequence charSequence) {
        replace(i14, i15, charSequence);
        return this;
    }

    public i(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f1917b = new ArrayList();
        k7.h.e(cls, "watcherClass cannot be null");
        this.f1916a = cls;
    }

    public i(Class<?> cls, CharSequence charSequence, int i14, int i15) {
        super(charSequence, i14, i15);
        this.f1917b = new ArrayList();
        k7.h.e(cls, "watcherClass cannot be null");
        this.f1916a = cls;
    }
}
