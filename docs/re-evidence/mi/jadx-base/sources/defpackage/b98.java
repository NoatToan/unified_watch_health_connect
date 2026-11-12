package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class b98 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3942a;

    @RequiresApi(19)
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f3943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x88 f3944b;
        public boolean c = true;

        public a(TextView textView) {
            this.f3943a = textView;
            this.f3944b = new x88(textView);
        }

        @Override // b98.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // b98.b
        public boolean b() {
            return this.c;
        }

        @Override // b98.b
        public void c(boolean z) {
            if (z) {
                l();
            }
        }

        @Override // b98.b
        public void d(boolean z) {
            this.c = z;
            l();
            k();
        }

        @Override // b98.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return this.c ? m(transformationMethod) : j(transformationMethod);
        }

        public final InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f3944b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f3944b;
            return inputFilterArr2;
        }

        public final SparseArray<InputFilter> g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof x88) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        public final InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (sparseArrayG.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public void i(boolean z) {
            this.c = z;
        }

        public final TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof d98 ? ((d98) transformationMethod).a() : transformationMethod;
        }

        public final void k() {
            this.f3943a.setFilters(a(this.f3943a.getFilters()));
        }

        public void l() {
            this.f3943a.setTransformationMethod(e(this.f3943a.getTransformationMethod()));
        }

        public final TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof d98) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new d98(transformationMethod);
        }
    }

    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z) {
            throw null;
        }

        public void d(boolean z) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    @RequiresApi(19)
    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f3945a;

        public c(TextView textView) {
            this.f3945a = new a(textView);
        }

        @Override // b98.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f3945a.a(inputFilterArr);
        }

        @Override // b98.b
        public boolean b() {
            return this.f3945a.b();
        }

        @Override // b98.b
        public void c(boolean z) {
            if (f()) {
                return;
            }
            this.f3945a.c(z);
        }

        @Override // b98.b
        public void d(boolean z) {
            if (f()) {
                this.f3945a.i(z);
            } else {
                this.f3945a.d(z);
            }
        }

        @Override // b98.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f3945a.e(transformationMethod);
        }

        public final boolean f() {
            return !androidx.emoji2.text.c.h();
        }
    }

    public b98(TextView textView, boolean z) {
        g6i.h(textView, "textView cannot be null");
        if (z) {
            this.f3942a = new a(textView);
        } else {
            this.f3942a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f3942a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f3942a.b();
    }

    public void c(boolean z) {
        this.f3942a.c(z);
    }

    public void d(boolean z) {
        this.f3942a.d(z);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f3942a.e(transformationMethod);
    }
}
