package com.huawei.ui.commonui.tablewidget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.qpp;
import defpackage.qpq;
import defpackage.qpr;
import defpackage.qpt;
import defpackage.qpu;
import health.compact.a.LanguageUtil;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public class HealthTableWidget extends ViewGroup implements ScrollHelper.ScrollHelperListener, HealthTableDataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qpq f23910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTableAdapter<ViewHolder> f23912c;
    private qpp d;
    private ScrollHelper e;
    private qpr f;
    private qpt g;
    private ScrollHelper.c h;
    private qpu<ViewHolder> i;

    public interface OnItemClickListener {
        void onItemClick(int i, int i2);
    }

    public interface OnItemLongClickListener {
        void onItemLongClick(int i, int i2);
    }

    private int e(int i) {
        return i;
    }

    @Override // com.huawei.ui.commonui.tablewidget.ScrollHelper.ScrollHelperListener
    public boolean onActionUp(MotionEvent motionEvent) {
        return true;
    }

    public HealthTableWidget(Context context) {
        super(context);
        this.f23911b = 1.0f;
        c(context, (AttributeSet) null);
        b(context);
    }

    public HealthTableWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23911b = 1.0f;
        c(context, attributeSet);
        b(context);
    }

    public HealthTableWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23911b = 1.0f;
        b(context);
        c(context, attributeSet);
    }

    public boolean b() {
        return getLayoutDirection() == 1 || LanguageUtil.ba(getContext());
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        HealthTableAdapter<ViewHolder> healthTableAdapter = this.f23912c;
        if (healthTableAdapter != null) {
            healthTableAdapter.setRtl(b());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            this.d.a(i3 - i);
            this.d.d(i4 - i2);
            notifyLayoutChanged();
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        this.d = new qpp(context, attributeSet);
    }

    private void b(Context context) {
        this.i = new qpu<>();
        this.f23910a = new qpq(this.d);
        this.h = new ScrollHelper.c(this);
        this.g = new qpt();
        ScrollHelper scrollHelper = new ScrollHelper(context);
        this.e = scrollHelper;
        scrollHelper.b(this);
        this.f = new qpr();
    }

    private void f() {
        qpq qpqVar = this.f23910a;
        if (qpqVar == null || this.f23912c == null) {
            LogUtil.j("CommonUI_HealthTableWidget", "initItems with null manager, pls check");
            return;
        }
        qpqVar.e();
        this.f23910a.c(this.f23912c.getRowCount(), this.f23912c.getColumnCount(), this.f23912c.getColumnHeaderNum(), this.f23912c.getStatisticNum(), this.f23912c.getRowHeaderNum());
        j();
        this.f23910a.l();
        d(this.f23910a.e(b()));
        if (b() && this.f23910a.f() != null && this.f23910a.f().e()) {
            scrollTo(((int) this.f23910a.h()) - this.d.d(), 0);
        }
    }

    private void j() {
        g();
        i();
    }

    private void g() {
        int iRound;
        int iB = this.f23910a.b();
        int[] iArr = new int[iB];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < iB; i3++) {
            int iMax = Math.max(0, this.f23912c.getColumnWidth(i3));
            iArr[i3] = iMax;
            i2 += iMax;
        }
        if (this.f23912c.getColumnWidthValueType() != 1) {
            while (i < iB) {
                this.f23910a.d(i, iArr[i]);
                i++;
            }
            return;
        }
        int iD = this.d.d() - ((this.d.o() ? this.f23910a.b() + 1 : this.f23910a.b() - 1) * this.d.c());
        int i4 = 0;
        while (i < iB) {
            if (i < iB - 1) {
                iRound = Math.round(((iArr[i] * iD) * 1.0f) / i2);
                i4 += iRound;
            } else {
                iRound = iD - i4;
            }
            this.f23910a.d(i, iRound);
            i++;
        }
    }

    private void i() {
        int iRound;
        int iJ = this.f23910a.j();
        int[] iArr = new int[this.f23910a.j()];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < iJ; i3++) {
            int iMax = Math.max(0, this.f23912c.getRowHeight(i3)) * Math.round(this.f23911b);
            iArr[i3] = iMax;
            i2 += iMax;
        }
        if (this.f23912c.getRowHeightValueType() != 1) {
            while (i < iJ) {
                this.f23910a.b(i, iArr[i]);
                i++;
            }
            return;
        }
        int iE = this.d.e() - ((this.d.m() ? this.f23910a.j() + 1 : this.f23910a.j() - 1) * this.d.b());
        int i4 = 0;
        while (i < iJ) {
            if (i < iJ - 1) {
                iRound = Math.round(((iArr[i] * iE) * 1.0f) / i2);
                i4 += iRound;
            } else {
                iRound = iE - i4;
            }
            this.f23910a.b(i, iRound);
            i++;
        }
    }

    public void setAdapter(HealthTableAdapter healthTableAdapter) {
        HealthTableAdapter<ViewHolder> healthTableAdapter2 = this.f23912c;
        if (healthTableAdapter2 != null) {
            healthTableAdapter2.unregisterDataSetObserver(this);
        }
        this.f23912c = healthTableAdapter;
        if (healthTableAdapter != null) {
            healthTableAdapter.registerDataSetObserver(this);
            this.f23912c.setRtl(b());
        }
        if (this.d.e() == 0 || this.d.d() == 0) {
            return;
        }
        f();
    }

    public void setPostureAdapter(HealthTableAdapter healthTableAdapter, float f) {
        setAdapter(healthTableAdapter);
        this.f23911b = f;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        scrollBy(i, i2);
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        long jH = this.f23910a.h();
        long jA = this.f23910a.a();
        if (this.f23910a.f().b() + i <= 0) {
            i = this.f23910a.f().b();
            this.f23910a.f().b(0);
        } else if (this.d.d() > jH) {
            this.f23910a.f().b(0);
            i = 0;
        } else if (this.f23910a.f().b() + this.d.d() + i > jH) {
            i = (int) ((jH - ((long) this.f23910a.f().b())) - ((long) this.d.d()));
            this.f23910a.f().b(this.f23910a.f().b() + i);
        } else {
            this.f23910a.f().b(this.f23910a.f().b() + i);
        }
        if (this.f23910a.f().a() + i2 <= 0) {
            i2 = this.f23910a.f().a();
            this.f23910a.f().e(0);
        } else if (this.d.e() > jA) {
            this.f23910a.f().e(0);
            i2 = 0;
        } else if (this.f23910a.f().a() + this.d.e() + i2 > jA) {
            i2 = (int) ((jA - ((long) this.f23910a.f().a())) - ((long) this.d.e()));
            this.f23910a.f().e(this.f23910a.f().a() + i2);
        } else {
            this.f23910a.f().e(this.f23910a.f().a() + i2);
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.f23912c != null) {
            h();
            d(this.f23910a.e(b()));
            l();
        }
    }

    private void l() {
        if (this.f23912c != null) {
            Iterator<ViewHolder> it = this.i.b().iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        }
        e();
    }

    private void g(ViewHolder viewHolder) {
        int itemType = viewHolder.getItemType();
        if (itemType == 0) {
            b(viewHolder);
            return;
        }
        if (itemType == 1) {
            h(viewHolder);
            return;
        }
        if (itemType == 2) {
            a(viewHolder);
            return;
        }
        if (itemType == 3) {
            c(viewHolder);
        } else if (itemType == 4) {
            j(viewHolder);
        } else {
            if (itemType != 5) {
                return;
            }
            i(viewHolder);
        }
    }

    private int c(int i) {
        if (b()) {
            return ((int) Math.max(this.f23910a.h(), this.d.d())) - (this.f23910a.a(0, Math.max(0, i)) + (this.d.o() ? this.d.c() : 0));
        }
        return this.f23910a.a(0, Math.max(0, i)) + (this.d.o() ? this.d.c() : 0);
    }

    private int a(int i) {
        return this.f23910a.c(0, Math.max(0, i)) + (this.d.m() ? this.d.b() : 0);
    }

    private void b(ViewHolder viewHolder) {
        View itemView = viewHolder.getItemView();
        int iA = a(viewHolder.getRowIndex()) - this.f23910a.f().a();
        int iC = c(viewHolder.getColumnIndex()) - this.f23910a.f().b();
        if (b()) {
            itemView.layout(iC - this.f23910a.b(viewHolder.getColumnIndex()), iA, iC, this.f23910a.c(viewHolder.getRowIndex()) + iA);
        } else {
            itemView.layout(iC, iA, this.f23910a.b(viewHolder.getColumnIndex()) + iC, this.f23910a.c(viewHolder.getRowIndex()) + iA);
        }
    }

    private void a(ViewHolder viewHolder) {
        int iC = c(viewHolder.getColumnIndex());
        int iB = this.f23910a.f().b();
        int iA = a(viewHolder.getRowIndex());
        if (!this.d.i()) {
            iA -= this.f23910a.f().a();
        }
        e(viewHolder, iC - iB, iA);
    }

    private void h(ViewHolder viewHolder) {
        int iC;
        int iA = a(viewHolder.getRowIndex());
        int iA2 = this.f23910a.f().a();
        int iC2 = c(viewHolder.getColumnIndex());
        if (!this.d.n()) {
            iC = this.f23910a.f().b();
        } else {
            if (b()) {
                iC2 = this.d.d();
                iC = this.d.o() ? this.d.c() : 0;
            }
            e(viewHolder, iC2, iA - iA2);
        }
        iC2 -= iC;
        e(viewHolder, iC2, iA - iA2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    private void c(ViewHolder viewHolder) {
        int iC;
        int iA;
        View itemView;
        int iC2 = c(viewHolder.getColumnIndex());
        if (!this.d.n()) {
            iC = this.f23910a.f().b();
        } else {
            if (b()) {
                iC2 = this.d.d();
                iC = this.d.o() ? this.d.c() : 0;
            }
            iA = a(viewHolder.getRowIndex());
            if (!this.d.i()) {
                iA -= this.f23910a.f().a();
            }
            itemView = viewHolder.getItemView();
            if (b()) {
                itemView.layout(iC2 - this.f23910a.b(viewHolder.getColumnIndex()), iA, iC2, this.f23910a.c(viewHolder.getRowIndex()) + iA);
            } else {
                itemView.layout(iC2, iA, this.f23910a.b(viewHolder.getColumnIndex()) + iC2, this.f23910a.c(viewHolder.getRowIndex()) + iA);
            }
        }
        iC2 -= iC;
        iA = a(viewHolder.getRowIndex());
        if (!this.d.i()) {
            iA -= this.f23910a.f().a();
        }
        itemView = viewHolder.getItemView();
        if (b()) {
            itemView.layout(iC2 - this.f23910a.b(viewHolder.getColumnIndex()), iA, iC2, this.f23910a.c(viewHolder.getRowIndex()) + iA);
        } else {
            itemView.layout(iC2, iA, this.f23910a.b(viewHolder.getColumnIndex()) + iC2, this.f23910a.c(viewHolder.getRowIndex()) + iA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    private void i(ViewHolder viewHolder) {
        int iC;
        int iA;
        int iA2;
        int iC2 = c(viewHolder.getColumnIndex());
        if (!this.d.n()) {
            iC = this.f23910a.f().b();
        } else {
            if (b()) {
                iC2 = this.d.d();
                iC = this.d.o() ? this.d.c() : 0;
            }
            iA = a(viewHolder.getRowIndex());
            if (this.d.l()) {
                int bottom = getBottom();
                int top = getTop();
                iA2 = ((bottom - top) - this.f23910a.c(viewHolder.getRowIndex(), this.f23910a.j())) + (this.d.m() ? 0 : this.d.b());
            } else {
                iA2 = iA - this.f23910a.f().a();
            }
            a(viewHolder, iC2, iA2);
        }
        iC2 -= iC;
        iA = a(viewHolder.getRowIndex());
        if (this.d.l()) {
            int bottom2 = getBottom();
            int top2 = getTop();
            iA2 = ((bottom2 - top2) - this.f23910a.c(viewHolder.getRowIndex(), this.f23910a.j())) + (this.d.m() ? 0 : this.d.b());
        } else {
            iA2 = iA - this.f23910a.f().a();
        }
        a(viewHolder, iC2, iA2);
    }

    private void j(ViewHolder viewHolder) {
        int iA;
        int iC = c(viewHolder.getColumnIndex());
        int iB = this.f23910a.f().b();
        int iA2 = a(viewHolder.getRowIndex());
        if (this.d.l()) {
            int bottom = getBottom();
            int top = getTop();
            iA = ((bottom - top) - this.f23910a.c(viewHolder.getRowIndex(), this.f23910a.j())) + (this.d.m() ? 0 : this.d.b());
        } else {
            iA = iA2 - this.f23910a.f().a();
        }
        a(viewHolder, iC - iB, iA);
    }

    private void h() {
        e(false);
    }

    private void e(boolean z) {
        View itemView;
        if (this.f23912c == null) {
            return;
        }
        for (ViewHolder viewHolder : this.i.b()) {
            if (viewHolder != null && (itemView = viewHolder.getItemView()) != null && (z || b(itemView))) {
                this.i.a(viewHolder.getRowIndex(), viewHolder.getColumnIndex());
                d(viewHolder);
            }
        }
    }

    private void a(ViewHolder viewHolder, int i, int i2) {
        View itemView = viewHolder.getItemView();
        if (b()) {
            itemView.layout(i - this.f23910a.b(viewHolder.getColumnIndex()), i2, i, this.f23910a.c(viewHolder.getRowIndex()) + i2);
        } else {
            itemView.layout(i, i2, this.f23910a.b(viewHolder.getColumnIndex()) + i, this.f23910a.c(viewHolder.getRowIndex()) + i2);
        }
        itemView.bringToFront();
    }

    private boolean b(View view) {
        return view.getRight() < 0 || view.getLeft() > this.d.d() || view.getBottom() < 0 || view.getTop() > this.d.e();
    }

    private void d(ViewHolder viewHolder) {
        this.g.d(viewHolder);
        removeView(viewHolder.getItemView());
        this.f23912c.onViewHolderRecycled(viewHolder);
    }

    private void d(Rect rect) {
        if (rect.left == rect.right || rect.top == rect.bottom) {
            return;
        }
        for (qpq.d[] dVarArr : this.f23910a.c(rect)) {
            for (qpq.d dVar : dVarArr) {
                if (this.i.b(dVar.e(), dVar.c()) == null && this.f23912c != null) {
                    b(dVar.e(), dVar.c(), dVar.b());
                }
            }
        }
        e();
    }

    private void e() {
        if (this.d.k()) {
            c();
            d();
        }
    }

    private void c() {
        if (this.d.d() >= this.f23910a.h()) {
            return;
        }
        if ((this.f23910a.f().b() == 0 && !b()) || (this.f23910a.f().b() != 0 && b())) {
            this.f.d(this);
            View viewB = this.f.b();
            if (viewB == null) {
                viewB = this.f.d(this, this.d.h());
            }
            int iD = this.d.d();
            if (b() && this.d.i()) {
                iD -= this.f23910a.g();
            }
            viewB.layout(iD - this.d.j(), this.d.i() ? 0 : -this.f23910a.f().a(), iD, this.d.e());
            viewB.bringToFront();
            return;
        }
        this.f.e(this);
        View viewA = this.f.a();
        if (viewA == null) {
            viewA = this.f.e(this, this.d.f());
        }
        int iG = (b() || !this.d.i()) ? 0 : this.f23910a.g();
        viewA.layout(iG, this.d.i() ? 0 : -this.f23910a.f().a(), this.d.j() + iG, this.d.e());
        viewA.bringToFront();
    }

    private void d() {
        if (this.d.e() >= this.f23910a.a()) {
            return;
        }
        if (this.f23910a.f().a() == 0) {
            this.f.a(this);
            View viewC = this.f.c();
            if (viewC == null) {
                viewC = this.f.c(this, this.d.a());
            }
            int iE = this.d.e() - this.d.j();
            if (this.d.l()) {
                iE -= this.f23910a.i();
            }
            viewC.layout(this.d.n() ? 0 : -this.f23910a.f().b(), iE, this.d.d(), this.d.j() + iE);
            viewC.bringToFront();
            return;
        }
        this.f.c(this);
        View viewE = this.f.e();
        if (viewE == null) {
            viewE = this.f.a(this, this.d.g());
        }
        int iC = this.d.n() ? this.f23910a.c() : 0;
        viewE.layout(this.d.n() ? 0 : -this.f23910a.f().b(), iC, this.d.d(), this.d.j() + iC);
        viewE.bringToFront();
    }

    private void b(int i, int i2, int i3) {
        ViewHolder viewHolderD = this.g.d(i3);
        if (viewHolderD == null) {
            viewHolderD = d(i3);
        }
        if (viewHolderD == null) {
            return;
        }
        viewHolderD.setRowIndex(i);
        viewHolderD.setColumnIndex(i2);
        viewHolderD.setItemType(i3);
        View itemView = viewHolderD.getItemView();
        if (b()) {
            itemView.setLayoutDirection(1);
        }
        itemView.setTag(R.id.tag_table_view_holder, viewHolderD);
        addView(itemView, 0);
        this.i.b(i, i2, viewHolderD);
        if (i3 == 0) {
            this.f23912c.onBindContentViewHolder(viewHolderD, i, e(i2));
        } else if (i3 == 1) {
            this.f23912c.onBindRowHeaderViewHolder(viewHolderD, i, e(i2));
        } else if (i3 == 2) {
            this.f23912c.onBindColumnHeaderViewHolder(viewHolderD, i, e(i2));
        } else if (i3 == 3) {
            this.f23912c.onBindRowColumnHeaderViewHolder(viewHolderD, i, e(i2));
        } else if (i3 == 4) {
            this.f23912c.onBindStatisticViewHolder(viewHolderD, i, e(i2));
        } else if (i3 == 5) {
            this.f23912c.onBindStatisticHeaderViewHolder(viewHolderD, i, e(i2));
        }
        itemView.measure(View.MeasureSpec.makeMeasureSpec(this.f23910a.b(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23910a.c(i), 1073741824));
        g(viewHolderD);
    }

    private ViewHolder d(int i) {
        if (i == 0) {
            return this.f23912c.onCreateItemViewHolder(this);
        }
        if (i == 1) {
            return this.f23912c.onCreateRowHeaderViewHolder(this);
        }
        if (i == 2) {
            return this.f23912c.onCreateColumnHeaderViewHolder(this);
        }
        if (i == 3) {
            return this.f23912c.onCreateRowColumnHeaderViewHolder(this);
        }
        if (i == 4) {
            return this.f23912c.onCreateStatisticViewHolder(this);
        }
        if (i == 5) {
            return this.f23912c.onCreateStatisticHeaderViewHolder(this);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.e.a(motionEvent);
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.e.a(motionEvent);
    }

    private int getRowHeaderStartX() {
        if (b()) {
            return this.d.d() - this.f23910a.g();
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int iB;
        int i;
        ViewHolder viewHolder = (ViewHolder) view.getTag(R.id.tag_table_view_holder);
        canvas.save();
        if (this.d.n()) {
            iB = 0;
        } else if (b()) {
            iB = (((int) this.f23910a.h()) - this.d.d()) - this.f23910a.f().b();
        } else {
            iB = this.f23910a.f().b();
        }
        int iA = this.d.i() ? 0 : this.f23910a.f().a();
        int iMax = !b() ? Math.max(0, this.f23910a.g() - iB) : 0;
        int iD = !b() ? this.d.d() : Math.min(getRowHeaderStartX() + iB, this.d.d());
        int iMax2 = Math.max(0, this.f23910a.c() - iA);
        int iE = this.d.e();
        if (this.d.l()) {
            iE -= this.f23910a.i();
            i = iE;
        } else {
            i = iMax2;
        }
        int i2 = !b() ? 0 : iD;
        int iD2 = !b() ? iMax : this.d.d();
        if (viewHolder != null) {
            if (viewHolder.getItemType() == 0) {
                canvas.clipRect(iMax, iMax2, iD, iE);
            } else if (viewHolder.getItemType() == 1) {
                canvas.clipRect(i2, iMax2, iD2, iE);
            } else if (viewHolder.getItemType() == 2) {
                canvas.clipRect(iMax, 0, iD, Math.max(0, this.f23910a.c() - iA));
            } else if (viewHolder.getItemType() == 3) {
                canvas.clipRect(i2, 0, iD2, Math.max(0, this.f23910a.c() - iA));
            } else if (viewHolder.getItemType() == 5) {
                canvas.clipRect(i2, i, iD2, this.d.e());
            } else if (viewHolder.getItemType() == 4) {
                canvas.clipRect(iMax, i, iD, this.d.e());
            }
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }

    @Override // com.huawei.ui.commonui.tablewidget.ScrollHelper.ScrollHelperListener
    public boolean onDown(MotionEvent motionEvent) {
        if (this.h.c()) {
            return true;
        }
        this.h.e();
        return true;
    }

    @Override // com.huawei.ui.commonui.tablewidget.ScrollHelper.ScrollHelperListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        OnItemClickListener onItemClickListener;
        ViewHolder viewHolderC = c((int) motionEvent.getX(), (int) motionEvent.getY());
        if (viewHolderC == null || (onItemClickListener = this.f23912c.getOnItemClickListener()) == null) {
            return true;
        }
        onItemClickListener.onItemClick(viewHolderC.getRowIndex(), viewHolderC.getColumnIndex());
        return true;
    }

    @Override // com.huawei.ui.commonui.tablewidget.ScrollHelper.ScrollHelperListener
    public void onLongPress(MotionEvent motionEvent) {
        ViewHolder viewHolderC = c((int) motionEvent.getX(), (int) motionEvent.getY());
        if (viewHolderC != null) {
            e(viewHolderC);
        }
    }

    private void e(ViewHolder viewHolder) {
        OnItemLongClickListener onItemLongClickListener = this.f23912c.getOnItemLongClickListener();
        if (onItemLongClickListener != null) {
            onItemLongClickListener.onItemLongClick(viewHolder.getRowIndex(), viewHolder.getColumnIndex());
        }
    }

    private ViewHolder c(int i, int i2) {
        int iB;
        int iE;
        int iA;
        if (b()) {
            i = this.d.d() - i;
        }
        if (b()) {
            int iH = (int) this.f23910a.h();
            iB = ((iH + i) - this.d.d()) - this.f23910a.f().b();
        } else {
            iB = this.f23910a.f().b() + i;
        }
        int iA2 = this.f23910a.f().a();
        if (this.d.n() && i <= this.f23910a.g()) {
            iE = this.f23910a.e(i);
        } else {
            iE = this.f23910a.e(iB);
        }
        if (this.d.i() && i2 <= this.f23910a.c()) {
            iA = this.f23910a.a(i2);
        } else if (this.d.l() && this.d.e() - i2 <= this.f23910a.i()) {
            int iO = this.f23910a.o();
            int i3 = 1;
            while (true) {
                if (i3 > iO) {
                    i3 = 0;
                    break;
                }
                int iE2 = this.d.e();
                qpq qpqVar = this.f23910a;
                if (iE2 - i2 < qpqVar.c(qpqVar.j() - i3, this.f23910a.j())) {
                    break;
                }
                i3++;
            }
            iA = this.f23910a.j() - i3;
        } else {
            iA = this.f23910a.a(iA2 + i2);
        }
        return this.i.b(iA, iE);
    }

    @Override // com.huawei.ui.commonui.tablewidget.ScrollHelper.ScrollHelperListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.h.c()) {
            this.h.e();
        }
        scrollBy((int) f, (int) f2);
        return true;
    }

    @Override // com.huawei.ui.commonui.tablewidget.ScrollHelper.ScrollHelperListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.h.d(this.f23910a.f().b(), this.f23910a.f().a(), ((int) f) / 2, ((int) f2) / 2, (int) (this.f23910a.h() - ((long) this.d.d())), (int) (this.f23910a.a() - ((long) this.d.e())));
        return true;
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableDataSetObserver
    public void notifyDataSetChanged() {
        e(true);
        f();
        d(this.f23910a.e(b()));
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableDataSetObserver
    public void notifyLayoutChanged() {
        e(true);
        f();
        invalidate();
        d(this.f23910a.e(b()));
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableDataSetObserver
    public void notifyItemChanged(int i, int i2) {
        ViewHolder viewHolderB = this.i.b(i, i2);
        if (viewHolderB != null) {
            f(viewHolderB);
        }
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableDataSetObserver
    public void notifyRowChanged(int i) {
        Iterator<ViewHolder> it = this.i.a(i).iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableDataSetObserver
    public void notifyColumnChanged(int i) {
        Iterator<ViewHolder> it = this.i.e(i).iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    private void f(ViewHolder viewHolder) {
        this.i.a(viewHolder.getRowIndex(), viewHolder.getColumnIndex());
        d(viewHolder);
        b(viewHolder.getRowIndex(), viewHolder.getColumnIndex(), viewHolder.getItemType());
    }

    private void e(ViewHolder viewHolder, int i, int i2) {
        View itemView = viewHolder.getItemView();
        if (b()) {
            itemView.layout(i - this.f23910a.b(viewHolder.getColumnIndex()), i2, i, this.f23910a.c(viewHolder.getRowIndex()) + i2);
        } else {
            itemView.layout(i, i2, this.f23910a.b(viewHolder.getColumnIndex()) + i, this.f23910a.c(viewHolder.getRowIndex()) + i2);
        }
    }

    public void a() {
        qpq qpqVar = this.f23910a;
        if (qpqVar == null || !qpqVar.m()) {
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.commonui.tablewidget.HealthTableWidget.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                HealthTableWidget.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                HealthTableWidget.this.scrollBy(0, 0);
                HealthTableWidget.this.n();
            }
        });
    }
}
