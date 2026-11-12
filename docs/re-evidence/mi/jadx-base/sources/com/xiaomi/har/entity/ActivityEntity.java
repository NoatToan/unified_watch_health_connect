package com.xiaomi.har.entity;

import defpackage.deo;
import defpackage.dfp;
import defpackage.o7i;
import defpackage.x61;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ActivityEntity implements Serializable, Cloneable {
    private Integer actType;
    private List<ActivityEntity> childActivity;
    private boolean complete;
    private boolean confidence;
    private long continued;
    private boolean display;
    private long end;
    private float pressureDiff;
    private float pressureEnd;
    private float pressureStart;
    private List<o7i> pressures;
    private long start;
    private int stepCount;
    private List<deo> stepEntities;
    private float totalDownAltitude;
    private float totalUpAltitude;

    public ActivityEntity(int i, long j, long j2) {
        this.stepCount = 0;
        this.complete = true;
        this.display = false;
        this.confidence = false;
        this.pressureDiff = 0.0f;
        this.pressureStart = 0.0f;
        this.pressureEnd = 0.0f;
        this.stepEntities = new ArrayList();
        this.childActivity = new ArrayList();
        this.pressures = new ArrayList();
        this.totalUpAltitude = 0.0f;
        this.totalDownAltitude = 0.0f;
        this.actType = Integer.valueOf(i);
        this.continued = j2 - j;
        this.start = j;
        this.end = j2;
    }

    public void addAllChildActivity(List<ActivityEntity> list) {
        Iterator<ActivityEntity> it = list.iterator();
        while (it.hasNext()) {
            addChildActivity(it.next());
        }
    }

    public void addChildActivity(ActivityEntity activityEntity) {
        if (this.childActivity.size() == 1 && this.childActivity.get(0).getEnd() == this.end && this.childActivity.get(0).getStart().longValue() == this.start) {
            return;
        }
        this.pressureDiff += activityEntity.getPressureDiff();
        this.childActivity.add(new ActivityEntity(activityEntity.getActType().intValue(), activityEntity.getContinued().longValue(), activityEntity.getStart().longValue(), activityEntity.getEnd(), activityEntity.getStepCount(), this.pressureDiff, activityEntity.getPressureStart(), activityEntity.getPressureEnd()));
        this.pressures.addAll(activityEntity.getPressures());
    }

    public void clearChild() {
        this.childActivity = new ArrayList();
    }

    public Integer getActType() {
        return this.actType;
    }

    public List<ActivityEntity> getChildActivity() {
        return this.childActivity;
    }

    public Long getContinued() {
        return Long.valueOf(this.continued);
    }

    public String getDateEnd() {
        return dfp.b(this.end);
    }

    public String getDateStart() {
        return dfp.b(this.start);
    }

    public long getEnd() {
        return this.end;
    }

    public float getPressureDiff() {
        return this.pressureDiff;
    }

    public float getPressureEnd() {
        return this.pressureEnd;
    }

    public float getPressureStart() {
        return this.pressureStart;
    }

    public List<o7i> getPressures() {
        return this.pressures;
    }

    public Long getStart() {
        return Long.valueOf(this.start);
    }

    public int getStepCount() {
        return this.stepCount;
    }

    public List<deo> getStepEntities() {
        return this.stepEntities;
    }

    public float getTotalDownAltitude() {
        return this.totalDownAltitude;
    }

    public float getTotalUpAltitude() {
        return this.totalUpAltitude;
    }

    public float getUpHeight() {
        return x61.c(this.pressureEnd) - x61.c(this.pressureStart);
    }

    public boolean isComplete() {
        return this.complete;
    }

    public boolean isConfidence() {
        return this.confidence;
    }

    public boolean isDisplay() {
        return this.display;
    }

    public void setActType(Integer num) {
        this.actType = num;
    }

    public void setChildActivity() {
        if (this.childActivity.size() > 1) {
            return;
        }
        if (this.childActivity.size() == 1 && this.childActivity.get(0).getEnd() == this.end && this.childActivity.get(0).getStart().longValue() == this.start) {
            return;
        }
        addChildActivity(new ActivityEntity(this.actType.intValue(), this.continued, this.start, this.end, this.stepCount, this.pressureDiff, this.pressureStart, this.pressureEnd));
    }

    public void setComplete(boolean z) {
        this.complete = z;
        Iterator<ActivityEntity> it = this.childActivity.iterator();
        while (it.hasNext()) {
            it.next().setComplete(z);
        }
    }

    public void setConfidence(boolean z) {
        this.confidence = z;
        Iterator<ActivityEntity> it = this.childActivity.iterator();
        while (it.hasNext()) {
            it.next().setConfidence(z);
        }
    }

    public void setContinuedTime(long j) {
        this.continued = j;
    }

    public void setDisplay(boolean z) {
        this.display = z;
        Iterator<ActivityEntity> it = this.childActivity.iterator();
        while (it.hasNext()) {
            it.next().setDisplay(z);
        }
    }

    public void setEnd(long j) {
        this.end = j;
        this.continued = j - this.start;
    }

    public void setEndTime(long j) {
        this.end = j;
    }

    public void setPressureDiff(float f) {
        this.pressureDiff = f;
    }

    public void setPressureEnd(float f) {
        this.pressureEnd = f;
    }

    public void setPressureStart(float f) {
        this.pressureStart = f;
    }

    public void setPressures(List<o7i> list) {
        this.pressures = list;
    }

    public void setStart(long j) {
        this.start = j;
    }

    public void setStepCount(int i) {
        this.stepCount = i;
    }

    public void setStepEntities(List<deo> list) {
        this.stepEntities = list;
    }

    public void setTotalDownAltitude(float f) {
        this.totalDownAltitude = f;
    }

    public void setTotalUpAltitude(float f) {
        this.totalUpAltitude = f;
    }

    public String toString() {
        return "{运行类型：" + this.actType + ", 起止高度差：" + getUpHeight() + ", 累计爬升高度：" + this.totalUpAltitude + ", 累计下降高度：" + this.totalDownAltitude + ", 置信度：" + this.confidence + ", 是否已完成：" + this.complete + ", 是否可展示：" + this.display + ", 开始气压：" + this.pressureStart + ", 结束气压：" + this.pressureEnd + ", 气压差：" + this.pressureDiff + ", 持续了：" + ((this.continued * 1.0d) / 1000.0d) + "s, 开始：" + getStart() + "-" + getDateStart() + ", 结束：" + getEnd() + "-" + getDateEnd() + ", 步数：" + this.stepCount + ", 详细运动：" + this.childActivity + ", 步数详细信息：" + this.stepEntities + ", 气压海拔信息：" + this.pressures + "}";
    }

    public void updateStepCount() {
        setStepCount(0);
        Iterator<deo> it = this.stepEntities.iterator();
        while (it.hasNext()) {
            this.stepCount += it.next().a();
        }
    }

    public void updatetContinued() {
        this.continued = 0L;
        Iterator<ActivityEntity> it = this.childActivity.iterator();
        while (it.hasNext()) {
            this.continued += it.next().getContinued().longValue();
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ActivityEntity m661clone() {
        try {
            return (ActivityEntity) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ActivityEntity(Integer num, long j, long j2, float f, float f2) {
        this.stepCount = 0;
        this.complete = true;
        this.display = false;
        this.confidence = false;
        this.pressureDiff = 0.0f;
        this.pressureStart = 0.0f;
        this.pressureEnd = 0.0f;
        this.stepEntities = new ArrayList();
        this.childActivity = new ArrayList();
        this.pressures = new ArrayList();
        this.totalUpAltitude = 0.0f;
        this.totalDownAltitude = 0.0f;
        this.actType = num;
        this.continued = j2 - j;
        this.start = j;
        this.end = j2;
        this.pressureStart = f;
        this.pressureEnd = f2;
    }

    public ActivityEntity(int i, long j, long j2, long j3, int i2) {
        this.stepCount = 0;
        this.complete = true;
        this.display = false;
        this.confidence = false;
        this.pressureDiff = 0.0f;
        this.pressureStart = 0.0f;
        this.pressureEnd = 0.0f;
        this.stepEntities = new ArrayList();
        this.childActivity = new ArrayList();
        this.pressures = new ArrayList();
        this.totalUpAltitude = 0.0f;
        this.totalDownAltitude = 0.0f;
        this.actType = Integer.valueOf(i);
        this.continued = j;
        this.start = j2;
        this.end = j3;
        this.stepCount = i2;
    }

    public ActivityEntity(int i, long j, long j2, long j3, int i2, float f, float f2, float f3, List<o7i> list) {
        this.stepCount = 0;
        this.complete = true;
        this.display = false;
        this.confidence = false;
        this.pressureDiff = 0.0f;
        this.pressureStart = 0.0f;
        this.pressureEnd = 0.0f;
        this.stepEntities = new ArrayList();
        this.childActivity = new ArrayList();
        this.pressures = new ArrayList();
        this.totalUpAltitude = 0.0f;
        this.totalDownAltitude = 0.0f;
        this.actType = Integer.valueOf(i);
        this.continued = j;
        this.start = j2;
        this.end = j3;
        this.stepCount = i2;
        this.pressureDiff = f;
        this.pressureStart = f2;
        this.pressureEnd = f3;
        this.pressures = list;
    }

    public ActivityEntity(int i, long j, long j2, long j3, int i2, float f, float f2, float f3) {
        this.stepCount = 0;
        this.complete = true;
        this.display = false;
        this.confidence = false;
        this.pressureDiff = 0.0f;
        this.pressureStart = 0.0f;
        this.pressureEnd = 0.0f;
        this.stepEntities = new ArrayList();
        this.childActivity = new ArrayList();
        this.pressures = new ArrayList();
        this.totalUpAltitude = 0.0f;
        this.totalDownAltitude = 0.0f;
        this.actType = Integer.valueOf(i);
        this.continued = j;
        this.start = j2;
        this.end = j3;
        this.stepCount = i2;
        this.pressureDiff = f;
        this.pressureStart = f2;
        this.pressureEnd = f3;
    }
}
