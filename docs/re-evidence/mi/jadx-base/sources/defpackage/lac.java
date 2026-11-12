package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public class lac extends dzo {
    public int c;

    public static class b extends fzo<lac> {
        public int h;

        public b(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
            this.h = -1;
        }

        public static b y(ylb ylbVar, apr aprVar) {
            return new b(ylbVar, aprVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public lac o(jgj jgjVar) {
            return new lac(u(), jgjVar, this.h);
        }

        public void z(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Number of glyphs can't be negative.");
            }
            this.h = i;
            x().c = i;
        }
    }

    public enum c {
        version(0),
        numRecords(2),
        sizeDeviceRecord(4),
        records(8),
        deviceRecordPixelSize(0),
        deviceRecordMaxWidth(1),
        deviceRecordWidths(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24826a;

        c(int i2) {
            this.f24826a = i2;
        }
    }

    public int m(int i) {
        if (i < 0 || i >= o()) {
            throw new IndexOutOfBoundsException();
        }
        return this.f39611a.s(c.records.f24826a + (i * r()) + c.deviceRecordMaxWidth.f24826a);
    }

    public int o() {
        return this.f39611a.r(c.numRecords.f24826a);
    }

    public int q(int i) {
        if (i < 0 || i >= o()) {
            throw new IndexOutOfBoundsException();
        }
        return this.f39611a.s(c.records.f24826a + (i * r()) + c.deviceRecordPixelSize.f24826a);
    }

    public int r() {
        return this.f39611a.q(c.sizeDeviceRecord.f24826a);
    }

    public int t(int i, int i2) {
        if (i < 0 || i >= o() || i2 < 0 || i2 >= this.c) {
            throw new IndexOutOfBoundsException();
        }
        return this.f39611a.s(c.records.f24826a + (i * r()) + c.deviceRecordWidths.f24826a + i2);
    }

    public lac(ylb ylbVar, jgj jgjVar, int i) {
        super(ylbVar, jgjVar);
        this.c = i;
    }
}
