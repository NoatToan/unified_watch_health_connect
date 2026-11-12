package c8;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f25275a;

    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f25276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f25277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f25278c = true;

        public a(TextView textView) {
            this.f25276a = textView;
            this.f25277b = new d(textView);
        }

        @Override // c8.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f25278c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i14 = 0; i14 < inputFilterArr.length; i14++) {
                    InputFilter inputFilter = inputFilterArr[i14];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i14, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i15 = 0;
                for (int i16 = 0; i16 < length; i16++) {
                    if (sparseArray.indexOfKey(i16) < 0) {
                        inputFilterArr2[i15] = inputFilterArr[i16];
                        i15++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i17 = 0;
            while (true) {
                d dVar = this.f25277b;
                if (i17 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = dVar;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i17] == dVar) {
                    return inputFilterArr;
                }
                i17++;
            }
        }

        @Override // c8.f.b
        public final boolean b() {
            return this.f25278c;
        }

        @Override // c8.f.b
        public final void c(boolean z14) {
            if (z14) {
                TextView textView = this.f25276a;
                textView.setTransformationMethod(e(textView.getTransformationMethod()));
            }
        }

        @Override // c8.f.b
        public final void d(boolean z14) {
            this.f25278c = z14;
            TextView textView = this.f25276a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
            textView.setFilters(a(textView.getFilters()));
        }

        @Override // c8.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.f25278c) {
                return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
            }
            return transformationMethod instanceof h ? ((h) transformationMethod).f25285a : transformationMethod;
        }
    }

    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean b() {
            return false;
        }

        public void c(boolean z14) {
        }

        public void d(boolean z14) {
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f25279a;

        public c(TextView textView) {
            this.f25279a = new a(textView);
        }

        @Override // c8.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return !androidx.emoji2.text.d.e() ? inputFilterArr : this.f25279a.a(inputFilterArr);
        }

        @Override // c8.f.b
        public final boolean b() {
            return this.f25279a.f25278c;
        }

        @Override // c8.f.b
        public final void c(boolean z14) {
            if (androidx.emoji2.text.d.e()) {
                this.f25279a.c(z14);
            }
        }

        @Override // c8.f.b
        public final void d(boolean z14) {
            boolean zE = androidx.emoji2.text.d.e();
            a aVar = this.f25279a;
            if (zE) {
                aVar.d(z14);
            } else {
                aVar.f25278c = z14;
            }
        }

        @Override // c8.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            return !androidx.emoji2.text.d.e() ? transformationMethod : this.f25279a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z14) {
        k7.h.e(textView, "textView cannot be null");
        if (z14) {
            this.f25275a = new a(textView);
        } else {
            this.f25275a = new c(textView);
        }
    }

    public f(TextView textView) {
        this(textView, true);
    }
}
