package defpackage;

import com.huawei.ui.commonui.tablewidget.model.ItemData;
import com.huawei.ui.commonui.tablewidget.model.TableDataSet;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public class qpv<T0 extends ItemData, T1 extends ItemData, T2 extends ItemData, T3 extends ItemData, T4 extends ItemData, T5 extends ItemData> implements TableDataSet<T0, T1, T2, T3, T4, T5> {
    private qpu<T0> d = new qpu<>();
    private qpu<T1> g = new qpu<>();
    private qpu<T2> e = new qpu<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qpu<T3> f46629c = new qpu<>();
    private qpu<T4> h = new qpu<>();
    private qpu<T5> i = new qpu<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<Integer> f46627a = new HashSet();
    private Set<Integer> f = new HashSet();
    private Set<Integer> l = new HashSet();
    private int j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46628b = 0;

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public T0 getColumnHeaderData(int i, int i2) {
        return this.d.b(i, i2);
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public void putColumnHeaderData(int i, int i2, T0 t0) {
        b(i, i2);
        this.f46627a.add(Integer.valueOf(i));
        this.d.b(i, i2, t0);
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public T1 getRowHeaderData(int i, int i2) {
        return this.g.b(i, i2);
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public void putRowHeaderData(int i, int i2, T1 t1) {
        b(i, i2);
        this.f.add(Integer.valueOf(i2));
        this.g.b(i, i2, t1);
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public T2 getRowColumnHeaderData(int i, int i2) {
        return this.e.b(i, i2);
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public void putRowColumnHeaderData(int i, int i2, T2 t2) {
        b(i, i2);
        this.e.b(i, i2, t2);
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public T3 getContentData(int i, int i2) {
        return this.f46629c.b(i, i2);
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public void putContentData(int i, int i2, T3 t3) {
        b(i, i2);
        this.f46629c.b(i, i2, t3);
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public T4 getStatisticHeaderData(int i, int i2) {
        return this.h.b(i, i2);
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public void putStatisticHeaderData(int i, int i2, T4 t4) {
        b(i, i2);
        this.l.add(Integer.valueOf(i));
        this.h.b(i, i2, t4);
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public T5 getStatisticData(int i, int i2) {
        return this.i.b(i, i2);
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public void putStatisticData(int i, int i2, T5 t5) {
        b(i, i2);
        this.l.add(Integer.valueOf(i));
        this.i.b(i, i2, t5);
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public void clearAll() {
        this.g.a();
        this.d.a();
        this.e.a();
        this.f46629c.a();
        this.h.a();
        this.i.a();
        this.f.clear();
        this.f46627a.clear();
        this.l.clear();
        this.j = 0;
        this.f46628b = 0;
    }

    private void b(int i, int i2) {
        if (i > this.j - 1) {
            this.j = i + 1;
        }
        if (i2 > this.f46628b - 1) {
            this.f46628b = i2 + 1;
        }
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public int getRowsCount() {
        return this.j;
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.TableDataSet
    public int getColumnsCount() {
        return this.f46628b;
    }

    public int b() {
        return this.f46627a.size();
    }

    public int a() {
        return this.f.size();
    }

    public int e() {
        return this.l.size();
    }
}
