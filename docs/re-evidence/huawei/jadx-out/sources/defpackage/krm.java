package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class krm extends krl {
    public krm() {
        this(0, 0L, 0L, null, null);
    }

    public krm(int i, long j, long j2, String str, String str2) {
        super(i, j, j2, str2);
        this.mValueHolder.put("detail_data", str);
    }

    public String getSequenceData() {
        return this.mValueHolder.getAsString("detail_data");
    }

    public void setSequenceData(String str) {
        this.mValueHolder.put("detail_data", str);
    }

    @Override // defpackage.krl
    public String getMetaData() {
        return this.mValueHolder.getAsString("meta_data");
    }

    @Override // defpackage.krl
    public void setMetaData(String str) {
        this.mValueHolder.put("meta_data", str);
    }
}
