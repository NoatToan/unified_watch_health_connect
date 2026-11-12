package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ze2 {
    public static int c;
    public static int d;
    public static int e;
    public static int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<a> f41179a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f41180b;

    public static abstract class a {
        static final Comparator<a> DISTANCE_COMPARATOR = new C1166a();
        public int mEnterPoint;
        public int mTriggerPoint;

        /* JADX INFO: renamed from: ze2$a$a, reason: collision with other inner class name */
        public class C1166a implements Comparator<a> {
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(a aVar, a aVar2) {
                return Integer.compare(aVar.mEnterPoint, aVar2.mEnterPoint);
            }
        }

        public a(int i, int i2) {
            if (i < 0 || i2 < 0 || i2 < i) {
                throw new IllegalArgumentException("not allow enterPoint < 0 or triggerPoint < 0 or triggerPoint < enterPoint!");
            }
            this.mEnterPoint = i;
            this.mTriggerPoint = i2;
        }

        public void notifyActivated() {
            onActivated();
        }

        public void notifyEntered() {
            onEntered();
        }

        public void notifyExit() {
            onExit();
        }

        public void notifyFinished() {
            onFinished();
        }

        public void notifyTriggered() {
            onTriggered();
        }

        public abstract void onActivated();

        public View onCreateIndicator(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return null;
        }

        public abstract void onEntered();

        public abstract void onExit();

        public abstract void onFinished();

        public abstract void onTriggered();
    }

    public static abstract class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f41181b = {e2j.g, e2j.h, e2j.e, e2j.f};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f41182a;

        public interface a {
        }

        public interface b {
        }
    }

    public static abstract class d extends a {

        public interface a {
        }

        public d() {
            super(ze2.e, ze2.f);
        }
    }

    public ze2(Context context) {
        boolean z = s6g.f(context) == 2;
        c = context.getResources().getDimensionPixelSize(z ? lmi.f25222b : lmi.f25221a);
        boolean zS = s6g.s(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(lmi.d);
        d = dimensionPixelSize;
        if (zS && z) {
            dimensionPixelSize = (int) (dimensionPixelSize * 1.8f);
        }
        d = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(lmi.c);
        e = dimensionPixelSize2;
        f = dimensionPixelSize2;
    }

    public void d(a aVar) {
        if (aVar instanceof c) {
            this.f41180b = aVar;
            return;
        }
        int iBinarySearch = Collections.binarySearch(this.f41179a, aVar, a.DISTANCE_COMPARATOR);
        if (iBinarySearch >= 0) {
            throw new IllegalArgumentException("action conflict.");
        }
        this.f41179a.add((-iBinarySearch) - 1, aVar);
    }

    public List<a> e() {
        return this.f41179a;
    }

    public b f() {
        for (int i = 0; i < this.f41179a.size(); i++) {
            a aVar = this.f41179a.get(i);
            if (aVar != null && (aVar instanceof b)) {
                return (b) aVar;
            }
        }
        return null;
    }

    public c g() {
        return (c) this.f41180b;
    }

    public static abstract class b extends a {
        public static final int DEFAULT_OFFSET_POINT = 0;
        static final int[] DEFAULT_TRIGGER_TEXTIDS = {e2j.f16196a, e2j.d, e2j.c, e2j.f16197b};
        protected a mCompleteListener;
        private int mCountNoData;
        public int[] mTriggerTextIDs;
        public String[] mTriggerTexts;

        public interface a {
            void a(b bVar, int i);

            void b(b bVar);

            void c(b bVar);

            void d(b bVar);

            void e(b bVar, int i, String str);

            void f(b bVar);
        }

        /* JADX INFO: renamed from: ze2$b$b, reason: collision with other inner class name */
        public interface InterfaceC1167b {
            void a(int i);

            void b(int i);

            void c(int i);

            void d(int i);

            void e(int i);

            float f();

            void g(int i);

            void h(int i);

            void i(int i);

            void j(int i);
        }

        public b(int i) {
            super(i, ze2.c + i);
            int[] iArr = DEFAULT_TRIGGER_TEXTIDS;
            this.mTriggerTexts = new String[iArr.length];
            this.mCountNoData = 0;
            if (i < 0) {
                throw new IllegalArgumentException("invalid offsetPoint");
            }
            this.mTriggerTextIDs = iArr;
        }

        public int getCountNoData() {
            return this.mCountNoData;
        }

        public boolean isNoData() {
            return this.mCountNoData > 0;
        }

        public void notifyActionNoData() {
            a aVar = this.mCompleteListener;
            if (aVar != null) {
                int i = this.mCountNoData + 1;
                this.mCountNoData = i;
                aVar.a(this, i);
            }
        }

        public void notifyLoadCancel() {
            a aVar = this.mCompleteListener;
            if (aVar != null) {
                aVar.f(this);
            }
        }

        public void notifyLoadComplete() {
            a aVar = this.mCompleteListener;
            if (aVar != null) {
                aVar.b(this);
            }
        }

        public void notifyLoadFail() {
            a aVar = this.mCompleteListener;
            if (aVar != null) {
                aVar.d(this);
            }
        }

        public void notifyTriggerTextIndex(int i, String str) {
            if (i >= DEFAULT_TRIGGER_TEXTIDS.length) {
                throw new IllegalArgumentException("invalid index");
            }
            a aVar = this.mCompleteListener;
            if (aVar != null) {
                aVar.e(this, i, str);
            }
        }

        public void startIndeterminateAction() {
            a aVar = this.mCompleteListener;
            if (aVar != null) {
                aVar.c(this);
            }
        }

        public b(int i, int[] iArr) {
            super(i, ze2.c + i);
            int[] iArr2 = DEFAULT_TRIGGER_TEXTIDS;
            this.mTriggerTexts = new String[iArr2.length];
            this.mCountNoData = 0;
            if (i >= 0) {
                if (iArr != null && iArr.length == iArr2.length) {
                    this.mTriggerTextIDs = iArr;
                    return;
                }
                throw new IllegalArgumentException("invalid text Ids");
            }
            throw new IllegalArgumentException("invalid offsetPoint");
        }

        public b(int i, int i2) {
            super(i, i2);
            int[] iArr = DEFAULT_TRIGGER_TEXTIDS;
            this.mTriggerTexts = new String[iArr.length];
            this.mCountNoData = 0;
            this.mTriggerTextIDs = iArr;
        }

        public b(int i, int i2, int[] iArr) {
            super(i, i2);
            int[] iArr2 = DEFAULT_TRIGGER_TEXTIDS;
            this.mTriggerTexts = new String[iArr2.length];
            this.mCountNoData = 0;
            if (iArr != null && iArr.length == iArr2.length) {
                this.mTriggerTextIDs = iArr;
                return;
            }
            throw new IllegalArgumentException("invalid text Ids");
        }
    }
}
