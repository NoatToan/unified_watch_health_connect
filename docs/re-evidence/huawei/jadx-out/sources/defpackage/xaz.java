package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseData;
import com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseMessage;
import com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.FitDesign;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CheckedOutputStream;

/* JADX INFO: loaded from: classes20.dex */
public class xaz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<BaseData> f52673c = new ArrayList();
    private FitDesign.a e = new FitDesign.a();

    public void b(List<BaseMessage> list) {
        this.f52673c.addAll(list);
    }

    public void c(BaseMessage baseMessage) {
        this.f52673c.add(baseMessage);
    }

    public File b(String str) {
        LogUtil.d("FitFile", "generateFitFile,path is", str);
        File file = new File(str);
        try {
            CheckedOutputStream checkedOutputStream = new CheckedOutputStream(new FileOutputStream(file, true), new xar());
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(checkedOutputStream);
                try {
                    Iterator<BaseData> it = this.f52673c.iterator();
                    int size = 0;
                    while (it.hasNext()) {
                        size += it.next().getSize();
                    }
                    this.e.d = size;
                    this.e.write(dataOutputStream);
                    Iterator<BaseData> it2 = this.f52673c.iterator();
                    while (it2.hasNext()) {
                        it2.next().write(dataOutputStream);
                    }
                    long value = checkedOutputStream.getChecksum().getValue();
                    dataOutputStream.write((int) (value & 255));
                    dataOutputStream.write((int) ((value >> 8) & 255));
                    dataOutputStream.close();
                    checkedOutputStream.close();
                    return file;
                } catch (Throwable th) {
                    try {
                        dataOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    checkedOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return file;
        }
    }
}
