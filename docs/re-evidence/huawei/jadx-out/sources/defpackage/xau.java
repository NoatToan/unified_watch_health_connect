package defpackage;

import com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseMessage;
import com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.FitDesign;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes20.dex */
public class xau extends BaseMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FitDesign.MessageNum f52667a;
    private byte e = 1;

    public xau(FitDesign.MessageNum messageNum, BaseMessage baseMessage) {
        this.mHead.f29168b = (short) 1;
        this.f52667a = messageNum;
        this.mFieldDefinitions = new ArrayList();
        Iterator<FitDesign.d> it = baseMessage.mFieldDefinitions.iterator();
        while (it.hasNext()) {
            this.mFieldDefinitions.add(it.next());
        }
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseData
    public DataOutputStream write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(64);
        dataOutputStream.write(0);
        dataOutputStream.write(this.e);
        dataOutputStream.write(this.f52667a.getTypeId() >> 8);
        dataOutputStream.write(this.f52667a.getTypeId());
        dataOutputStream.write(this.mFieldDefinitions.size());
        Iterator<FitDesign.d> it = this.mFieldDefinitions.iterator();
        while (it.hasNext()) {
            it.next().write(dataOutputStream);
        }
        return dataOutputStream;
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseMessage, com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseData
    public int getSize() {
        this.mSize = this.mHead.getSize() + 5 + (this.mFieldDefinitions.size() * 3);
        return this.mSize;
    }
}
