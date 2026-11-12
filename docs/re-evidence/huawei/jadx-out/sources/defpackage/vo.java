package defpackage;

import com.careforeyou.library.bt.bean.TaskData;
import com.careforeyou.library.intface.AsynBLETaskCallback;
import com.careforeyou.library.utils.CsBtUtil_v11;

/* JADX INFO: loaded from: classes4.dex */
public class vo {
    private CsBtUtil_v11 d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private vn<TaskData> f51389c = new vn<>();
    private boolean e = false;

    public vo(CsBtUtil_v11 csBtUtil_v11) {
        this.d = csBtUtil_v11;
    }

    public void c() {
        this.e = false;
        this.f51389c.c();
    }

    public void c(TaskData taskData) {
        this.f51389c.b(taskData);
    }

    public void a() {
        c((Boolean) true);
    }

    private void c(Boolean bool) {
        if (this.f51389c.e() == 0) {
            this.e = false;
            return;
        }
        if (this.e && bool.booleanValue()) {
            return;
        }
        this.e = true;
        TaskData taskDataD = this.f51389c.d();
        if (taskDataD.d == TaskData.TASK_TYPE.Read) {
            return;
        }
        if (taskDataD.d == TaskData.TASK_TYPE.Write) {
            this.d.c(taskDataD, new AsynBLETaskCallback() { // from class: vo.5
                @Override // com.careforeyou.library.intface.AsynBLETaskCallback
                public void success(Object obj) {
                    vo.this.d();
                }

                @Override // com.careforeyou.library.intface.AsynBLETaskCallback
                public void failed() {
                    vo.this.d();
                }
            });
        } else if (taskDataD.d == TaskData.TASK_TYPE.EnableNodification) {
            this.d.b(taskDataD.f4030b, new AsynBLETaskCallback() { // from class: vo.1
                @Override // com.careforeyou.library.intface.AsynBLETaskCallback
                public void success(Object obj) {
                    vo.this.d();
                }

                @Override // com.careforeyou.library.intface.AsynBLETaskCallback
                public void failed() {
                    vo.this.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f51389c.e() == 0) {
            this.e = false;
            return;
        }
        try {
            Thread.sleep(50L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c((Boolean) false);
    }
}
