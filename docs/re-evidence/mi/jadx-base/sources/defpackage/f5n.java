package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class f5n extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f17436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f17437b;

    public static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f17438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f17439b = new AtomicInteger(0);

        public a(Object obj) {
            this.f17438a = obj;
        }

        public final void a() {
            this.f17439b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f17438a).afterTextChanged(editable);
        }

        public final boolean b(Object obj) {
            return obj instanceof a98;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f17438a).beforeTextChanged(charSequence, i, i2, i3);
        }

        public final void c() {
            this.f17439b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f17439b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f17438a).onSpanAdded(spannable, obj, i, i2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001e A[PHI: r11
          0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f17439b.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i5 = i;
                    i6 = i3;
                } else {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i5 = i;
                        i6 = 0;
                    } else {
                        i5 = i;
                        i6 = i3;
                    }
                }
                ((SpanWatcher) this.f17438a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f17439b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f17438a).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f17438a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public f5n(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f17437b = new ArrayList();
        g6i.h(cls, "watcherClass cannot be null");
        this.f17436a = cls;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static f5n c(Class<?> cls, CharSequence charSequence) {
        return new f5n(cls, charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a() {
        b();
    }

    public final void b() {
        for (int i = 0; i < this.f17437b.size(); i++) {
            this.f17437b.get(i).a();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void d() {
        i();
        e();
    }

    public final void e() {
        for (int i = 0; i < this.f17437b.size(); i++) {
            this.f17437b.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    public final a f(Object obj) {
        for (int i = 0; i < this.f17437b.size(); i++) {
            a aVar = this.f17437b.get(i);
            if (aVar.f17438a == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean g(Class<?> cls) {
        return this.f17436a == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!g(cls)) {
            return (T[]) super.getSpans(i, i2, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i, i2, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f17438a;
        }
        return tArr;
    }

    public final boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    public final void i() {
        for (int i = 0; i < this.f17437b.size(); i++) {
            this.f17437b.get(i).c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVarF;
        if (h(obj)) {
            aVarF = f(obj);
            if (aVarF != null) {
                obj = aVarF;
            }
        } else {
            aVarF = null;
        }
        super.removeSpan(obj);
        if (aVarF != null) {
            this.f17437b.remove(aVarF);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f17437b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new f5n(this.f17436a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        b();
        super.replace(i, i2, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public f5n(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f17437b = new ArrayList();
        g6i.h(cls, "watcherClass cannot be null");
        this.f17436a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        b();
        super.replace(i, i2, charSequence, i3, i4);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
