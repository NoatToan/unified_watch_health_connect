package defpackage;

import com.xiaomi.har.entity.ActivityEntity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class i71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<ActivityEntity> f20847a;

    public i71(List<ActivityEntity> list) {
        new ArrayList();
        this.f20847a = list;
    }

    public List<ActivityEntity> a() {
        ArrayList arrayList = new ArrayList();
        for (ActivityEntity activityEntity : this.f20847a) {
            if (activityEntity.isComplete()) {
                arrayList.add(activityEntity);
            }
        }
        return arrayList;
    }

    public List<ActivityEntity> b() {
        ArrayList arrayList = new ArrayList();
        for (ActivityEntity activityEntity : this.f20847a) {
            if (activityEntity.isDisplay()) {
                arrayList.add(activityEntity);
            }
        }
        return arrayList;
    }

    public List<ActivityEntity> c() {
        ArrayList arrayList = new ArrayList();
        for (ActivityEntity activityEntity : this.f20847a) {
            if (activityEntity.isDisplay() && activityEntity.isConfidence()) {
                arrayList.add(activityEntity);
            }
        }
        return arrayList;
    }

    public List<ActivityEntity> d() {
        ArrayList arrayList = new ArrayList();
        for (ActivityEntity activityEntity : this.f20847a) {
            if (activityEntity.isDisplay() && !activityEntity.isConfidence()) {
                arrayList.add(activityEntity);
            }
        }
        return arrayList;
    }

    public List<ActivityEntity> e() {
        ArrayList arrayList = new ArrayList();
        for (ActivityEntity activityEntity : this.f20847a) {
            if (!activityEntity.isComplete()) {
                arrayList.add(activityEntity);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "[识别出的所有运动：" + this.f20847a + ", 获取所有可展示的高置信度的运动:" + c().toString() + ", 获取所有可展示的低置信度的运动:" + d().toString() + ", 未完成：" + e().toString() + "]";
    }
}
