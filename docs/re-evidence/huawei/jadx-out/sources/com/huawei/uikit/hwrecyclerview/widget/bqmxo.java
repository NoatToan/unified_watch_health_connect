package com.huawei.uikit.hwrecyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.uikit.hwunifiedinteract.widget.HwCompoundEventDetector;
import defpackage.xeh;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes20.dex */
class bqmxo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29677c;
    private ActionMode e;
    private int f;
    private HwRecyclerView i;
    private d k;
    private b l;
    private SparseBooleanArray m;
    private HwRecyclerView.MultiChoiceModeListener n;
    private LongSparseArray<Integer> o;
    private HwCompoundEventDetector.OnMultiSelectListener q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29675a = true;
    private boolean d = true;
    private int g = -1;
    private int j = -1;
    private int h = 0;

    static class akxao extends View.BaseSavedState {
        public static final Parcelable.Creator<akxao> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f29678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SparseBooleanArray f29680c;
        private LongSparseArray<Integer> d;
        private int e;
        private int f;

        class a implements Parcelable.Creator<akxao> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public akxao createFromParcel(Parcel parcel) {
                return new akxao(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public akxao[] newArray(int i) {
                return new akxao[i];
            }
        }

        /* synthetic */ akxao(Parcel parcel, c cVar) {
            this(parcel);
        }

        public String toString() {
            return "HwRecyclerView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " mCheckState=" + this.f29680c + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (parcel == null) {
                return;
            }
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f29678a ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f29679b);
            parcel.writeSparseBooleanArray(this.f29680c);
            LongSparseArray<Integer> longSparseArray = this.d;
            int size = longSparseArray != null ? longSparseArray.size() : 0;
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeLong(this.d.keyAt(i2));
                parcel.writeInt(this.d.valueAt(i2).intValue());
            }
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
        }

        akxao(Parcelable parcelable) {
            super(parcelable);
        }

        private akxao(Parcel parcel) {
            super(parcel);
            this.f29678a = parcel.readByte() != 0;
            this.f29679b = parcel.readInt();
            this.f29680c = parcel.readSparseBooleanArray();
            int i = parcel.readInt();
            if (i > 0 && i <= parcel.dataAvail() + 4) {
                this.d = new LongSparseArray<>();
                for (int i2 = 0; i2 < i; i2++) {
                    this.d.put(parcel.readLong(), Integer.valueOf(parcel.readInt()));
                }
            }
            this.e = parcel.readInt();
            this.f = parcel.readInt();
        }
    }

    class b extends RecyclerView.AdapterDataObserver {
        private b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            bqmxo.this.n();
            super.onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            bqmxo.this.n();
            super.onItemRangeChanged(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            bqmxo.this.n();
            super.onItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            bqmxo.this.n();
            super.onItemRangeMoved(i, i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            bqmxo.this.n();
            super.onItemRangeRemoved(i, i2);
        }

        /* synthetic */ b(bqmxo bqmxoVar, c cVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            bqmxo.this.n();
            super.onItemRangeChanged(i, i2, obj);
        }
    }

    class c implements HwCompoundEventDetector.OnMultiSelectListener {
        c() {
        }

        @Override // com.huawei.uikit.hwunifiedinteract.widget.HwCompoundEventDetector.OnMultiSelectListener
        public boolean onCancel(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.huawei.uikit.hwunifiedinteract.widget.HwCompoundEventDetector.OnMultiSelectListener
        public boolean onSelectContinuous(boolean z, MotionEvent motionEvent) {
            return bqmxo.this.d(motionEvent);
        }

        @Override // com.huawei.uikit.hwunifiedinteract.widget.HwCompoundEventDetector.OnMultiSelectListener
        public boolean onSelectDiscrete(MotionEvent motionEvent) {
            return bqmxo.this.a(motionEvent);
        }
    }

    class d implements HwRecyclerView.MultiChoiceModeListener {
        private HwRecyclerView.MultiChoiceModeListener e;

        d() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            HwRecyclerView.MultiChoiceModeListener multiChoiceModeListener = this.e;
            if (multiChoiceModeListener == null) {
                return false;
            }
            return multiChoiceModeListener.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            HwRecyclerView.MultiChoiceModeListener multiChoiceModeListener = this.e;
            if (multiChoiceModeListener == null || !multiChoiceModeListener.onCreateActionMode(actionMode, menu)) {
                return false;
            }
            bqmxo.this.i.setDetectoredLongpressEnabled(false);
            RecyclerView.Adapter adapter = bqmxo.this.i.getAdapter();
            if (adapter == null || !adapter.hasStableIds()) {
                return true;
            }
            bqmxo.this.l = new b(bqmxo.this, null);
            adapter.registerAdapterDataObserver(bqmxo.this.l);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            HwRecyclerView.MultiChoiceModeListener multiChoiceModeListener = this.e;
            if (multiChoiceModeListener != null) {
                multiChoiceModeListener.onDestroyActionMode(actionMode);
            }
            bqmxo.this.e = null;
            bqmxo.this.i.b();
            bqmxo.this.i.requestLayout();
            RecyclerView.Adapter adapter = bqmxo.this.i.getAdapter();
            if (adapter != null && bqmxo.this.l != null) {
                adapter.unregisterAdapterDataObserver(bqmxo.this.l);
                bqmxo.this.l = null;
            }
            bqmxo.this.i.setDetectoredLongpressEnabled(true);
        }

        @Override // com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView.MultiChoiceModeListener
        public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
            HwRecyclerView.MultiChoiceModeListener multiChoiceModeListener = this.e;
            if (multiChoiceModeListener == null || actionMode == null) {
                return;
            }
            multiChoiceModeListener.onItemCheckedStateChanged(actionMode, i, j, z);
            if (bqmxo.this.c() == 0) {
                actionMode.finish();
                bqmxo.this.m();
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            HwRecyclerView.MultiChoiceModeListener multiChoiceModeListener = this.e;
            if (multiChoiceModeListener == null) {
                return false;
            }
            return multiChoiceModeListener.onPrepareActionMode(actionMode, menu);
        }

        void c(HwRecyclerView.MultiChoiceModeListener multiChoiceModeListener) {
            this.e = multiChoiceModeListener;
        }
    }

    bqmxo(HwRecyclerView hwRecyclerView) {
        this.i = hwRecyclerView;
        a(hwRecyclerView.getContext());
    }

    private int[] l() {
        int[] iArr = new int[2];
        int i = this.g;
        int i2 = this.j;
        if (i <= i2) {
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }
        iArr[0] = i2;
        iArr[1] = i;
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        RecyclerView.Adapter adapter = this.i.getAdapter();
        if (this.h == 0 || adapter == null || !adapter.hasStableIds()) {
            return;
        }
        k();
    }

    int c() {
        return this.f;
    }

    long[] d() {
        LongSparseArray<Integer> longSparseArray;
        if (this.h == 0 || (longSparseArray = this.o) == null) {
            return new long[0];
        }
        int size = longSparseArray.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = this.o.keyAt(i);
        }
        return jArr;
    }

    protected HwCompoundEventDetector.OnMultiSelectListener e() {
        return new c();
    }

    HwCompoundEventDetector.OnMultiSelectListener f() {
        if (this.q == null) {
            this.q = e();
        }
        return this.q;
    }

    SparseBooleanArray g() {
        if (this.h == 3) {
            return this.m;
        }
        return null;
    }

    ActionMode h() {
        return this.e;
    }

    HwRecyclerView.MultiChoiceModeListener i() {
        return this.n;
    }

    int j() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    boolean o() {
        if (this.h != 3 || this.m == null) {
            return false;
        }
        int childCount = this.i.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.i.getChildAt(i);
            if (childAt != 0) {
                boolean z = this.m.get(this.i.getChildAdapterPosition(childAt));
                if (childAt instanceof Checkable) {
                    Checkable checkable = (Checkable) childAt;
                    if (checkable.isChecked() != z) {
                        checkable.setChecked(z);
                        childAt.jumpDrawablesToCurrentState();
                    }
                } else {
                    childAt.setActivated(z);
                    childAt.jumpDrawablesToCurrentState();
                }
            }
        }
        return true;
    }

    private void k() {
        ActionMode actionMode;
        this.m.clear();
        RecyclerView.Adapter adapter = this.i.getAdapter();
        if (adapter == null || this.o == null) {
            return;
        }
        int i = 0;
        boolean z = false;
        while (i < this.o.size()) {
            long jKeyAt = this.o.keyAt(i);
            int iIntValue = this.o.valueAt(i).intValue();
            if (jKeyAt != adapter.getItemId(iIntValue)) {
                int i2 = iIntValue - 20;
                int i3 = iIntValue + 20;
                int itemCount = adapter.getItemCount();
                if (!e(adapter, i, jKeyAt, i2 <= 0 ? 0 : i2, i3 <= itemCount ? i3 : itemCount)) {
                    this.o.delete(jKeyAt);
                    i--;
                    this.f--;
                    a(jKeyAt, iIntValue);
                    z = true;
                }
            } else {
                this.m.put(iIntValue, true);
            }
            i++;
        }
        if (!z || (actionMode = this.e) == null) {
            return;
        }
        actionMode.invalidate();
    }

    boolean c(MotionEvent motionEvent) {
        View viewFindChildViewUnder;
        if (this.h != 3 || this.e != null || (viewFindChildViewUnder = this.i.findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null || !e(this.i.getChildAdapterPosition(viewFindChildViewUnder))) {
            return false;
        }
        this.i.setPressed(false);
        viewFindChildViewUnder.setPressed(false);
        return true;
    }

    void b() {
        SparseBooleanArray sparseBooleanArray = this.m;
        if (sparseBooleanArray != null) {
            sparseBooleanArray.clear();
        }
        LongSparseArray<Integer> longSparseArray = this.o;
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
        this.f = 0;
    }

    private void a(Context context) {
        Method methodC = xeh.c("getBoolean", new Class[]{Context.class, View.class, String.class, Boolean.TYPE}, "huawei.android.widget.HwPlume");
        if (methodC == null) {
            return;
        }
        HwRecyclerView hwRecyclerView = this.i;
        Boolean bool = Boolean.TRUE;
        Object objC = xeh.c((Object) null, methodC, new Object[]{context, hwRecyclerView, "consecutiveSelectEnabled", bool});
        if (objC instanceof Boolean) {
            c(true, ((Boolean) objC).booleanValue());
        }
        Object objC2 = xeh.c((Object) null, methodC, new Object[]{context, this.i, "quickSelectEnabled", bool});
        if (objC2 instanceof Boolean) {
            c(false, ((Boolean) objC2).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.g = -1;
        this.j = -1;
    }

    akxao c(Parcelable parcelable) {
        akxao akxaoVar = new akxao(parcelable);
        akxaoVar.f29678a = this.h == 3 && this.e != null;
        SparseBooleanArray sparseBooleanArray = this.m;
        if (sparseBooleanArray != null) {
            akxaoVar.f29680c = sparseBooleanArray.clone();
        }
        if (this.o != null) {
            LongSparseArray longSparseArray = new LongSparseArray();
            int size = this.o.size();
            for (int i = 0; i < size; i++) {
                longSparseArray.put(this.o.keyAt(i), this.o.valueAt(i));
            }
            akxaoVar.d = longSparseArray;
        }
        akxaoVar.f29679b = this.f;
        akxaoVar.e = this.g;
        akxaoVar.f = this.j;
        return akxaoVar;
    }

    void a(int i) {
        this.h = i;
        ActionMode actionMode = this.e;
        if (actionMode != null) {
            actionMode.finish();
            m();
            this.e = null;
        }
        if (this.h == 3) {
            RecyclerView.Adapter adapter = this.i.getAdapter();
            if (this.m == null) {
                this.m = new SparseBooleanArray();
            }
            if (this.o == null && adapter != null && adapter.hasStableIds()) {
                this.o = new LongSparseArray<>();
            }
            b();
            this.i.setDetectoredLongpressEnabled(true);
        }
    }

    void e(boolean z) {
        int[] iArrL = l();
        int i = this.g;
        int i2 = this.j;
        for (int i3 = iArrL[0]; i3 <= iArrL[1]; i3++) {
            if (i3 != this.g || z) {
                this.i.setItemChecked(i3, z);
            }
        }
        this.g = i;
        this.j = i2;
    }

    private void b(int i) {
        this.g = i;
        this.j = -1;
    }

    boolean e(int i) {
        d dVar;
        if (this.h != 3) {
            return false;
        }
        if (this.e == null && (dVar = this.k) != null) {
            ActionMode actionModeStartActionMode = this.i.startActionMode(dVar);
            this.e = actionModeStartActionMode;
            if (actionModeStartActionMode != null) {
                this.i.setItemChecked(i, true);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(MotionEvent motionEvent) {
        View viewFindChildViewUnder;
        if (!this.f29675a || (viewFindChildViewUnder = this.i.findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null) {
            return false;
        }
        int childAdapterPosition = this.i.getChildAdapterPosition(viewFindChildViewUnder);
        if (this.h != 3 || this.e != null || childAdapterPosition == -1) {
            return false;
        }
        this.i.setItemChecked(childAdapterPosition, true);
        this.f29677c = true;
        return true;
    }

    void d(int i, boolean z) {
        RecyclerView.Adapter adapter = this.i.getAdapter();
        if (adapter == null || this.h != 3) {
            return;
        }
        if (z && this.e == null) {
            d dVar = this.k;
            if (dVar != null && dVar.e != null) {
                this.e = this.i.startActionMode(this.k);
            } else {
                Log.e("HwMultipleChoiceModeHelper", "The multi-select mode condition is not established");
                return;
            }
        }
        if (this.h == 3) {
            b(i);
            boolean z2 = this.m.get(i);
            this.m.put(i, z);
            b(z, adapter, i);
            boolean z3 = z2 != z;
            if (z3) {
                if (z) {
                    this.f++;
                } else {
                    this.f--;
                }
            }
            if (this.e != null) {
                this.k.onItemCheckedStateChanged(this.e, i, adapter.getItemId(i), z);
            }
            if (z3) {
                this.i.requestLayout();
            }
        }
    }

    private void b(boolean z, RecyclerView.Adapter adapter, int i) {
        if (this.o == null || !adapter.hasStableIds()) {
            return;
        }
        if (z) {
            this.o.put(adapter.getItemId(i), Integer.valueOf(i));
        } else {
            this.o.delete(adapter.getItemId(i));
        }
    }

    private boolean e(RecyclerView.Adapter adapter, int i, long j, int i2, int i3) {
        while (i2 < i3) {
            if (j == adapter.getItemId(i2)) {
                this.m.put(i2, true);
                this.o.setValueAt(i, Integer.valueOf(i2));
                return true;
            }
            i2++;
        }
        return false;
    }

    private void a(long j, int i) {
        d dVar;
        ActionMode actionMode = this.e;
        if (actionMode == null || (dVar = this.k) == null) {
            return;
        }
        dVar.onItemCheckedStateChanged(actionMode, i, j, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(View view, int i) {
        if (this.h != 3 || this.e == null) {
            return;
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.m.get(i));
        } else {
            view.setActivated(this.m.get(i));
        }
    }

    void a(RecyclerView.Adapter adapter) {
        if (adapter != null && this.h != 0 && adapter.hasStableIds() && this.o == null) {
            this.o = new LongSparseArray<>();
        }
        b();
        ActionMode actionMode = this.e;
        if (actionMode != null) {
            actionMode.finish();
            this.e = null;
        }
    }

    void c(boolean z, boolean z2) {
        if (z) {
            this.d = z2;
        } else {
            this.f29675a = z2;
        }
    }

    void e(HwRecyclerView.MultiChoiceModeListener multiChoiceModeListener) {
        if (this.k == null) {
            this.k = new d();
        }
        this.n = multiChoiceModeListener;
        this.k.c(multiChoiceModeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.d) {
            return false;
        }
        View viewFindChildViewUnder = this.i.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if (viewFindChildViewUnder != null) {
            int childAdapterPosition = this.i.getChildAdapterPosition(viewFindChildViewUnder);
            if (this.h == 3 && this.e != null && childAdapterPosition != -1) {
                int i = this.j;
                if (i != -1 && i != childAdapterPosition) {
                    e(false);
                }
                z = true;
                if (this.j != childAdapterPosition) {
                    this.j = childAdapterPosition;
                    e(true);
                }
                this.f29676b = true;
            }
        }
        return z;
    }

    Parcelable b(Parcelable parcelable) {
        d dVar;
        if (!(parcelable instanceof akxao)) {
            return null;
        }
        akxao akxaoVar = (akxao) parcelable;
        if (akxaoVar.f29680c != null) {
            this.m = akxaoVar.f29680c;
        }
        if (akxaoVar.d != null) {
            this.o = akxaoVar.d;
        }
        this.f = akxaoVar.f29679b;
        if (akxaoVar.f29678a && this.h == 3 && (dVar = this.k) != null) {
            this.e = this.i.startActionMode(dVar);
        }
        this.g = akxaoVar.e;
        this.j = akxaoVar.f;
        this.i.requestLayout();
        return akxaoVar.getSuperState();
    }

    void a() {
        SparseBooleanArray sparseBooleanArray = this.m;
        if (sparseBooleanArray != null) {
            int size = sparseBooleanArray.size();
            for (int i = 0; i < size; i++) {
                d(this.m.keyAt(i), false);
            }
        }
    }
}
