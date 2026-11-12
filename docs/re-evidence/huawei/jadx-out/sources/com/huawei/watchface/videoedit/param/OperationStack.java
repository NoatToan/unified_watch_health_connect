package com.huawei.watchface.videoedit.param;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class OperationStack {
    private static final Gson GSON = new Gson();
    private static final int STACK_SIZE = 5;
    private int newIndex = 0;
    private int oldIndex = 0;
    private int activeIndex = -1;
    private String[] stack = new String[5];

    private boolean stateReady() {
        return this.oldIndex != this.newIndex;
    }

    public boolean isBackwordEnable() {
        HwLog.d(HwLog.TAG, "isBackwordEnable oldIndex " + this.oldIndex + " newIndex length is " + this.newIndex + " activeIndex is " + this.activeIndex);
        return stateReady() && this.activeIndex != this.oldIndex;
    }

    public boolean isForwordEnable() {
        HwLog.d(HwLog.TAG, "isForwordEnable oldIndex " + this.oldIndex + " newIndex length is " + this.newIndex + " activeIndex is " + this.activeIndex);
        return stateReady() && (this.activeIndex + 1) % 5 != this.newIndex;
    }

    public void queueStack(TemplateModel templateModel) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String json = new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(templateModel);
        HwLog.d(HwLog.TAG, "queueStack cost is " + (System.currentTimeMillis() - jCurrentTimeMillis) + " content length is " + json.length());
        int i = (this.activeIndex + 1) % 5;
        this.activeIndex = i;
        this.stack[i] = json;
        int i2 = (i + 1) % 5;
        this.newIndex = i2;
        int i3 = this.oldIndex;
        if (i2 == i3) {
            this.oldIndex = (i3 + 1) % 5;
        }
    }

    public void reset() {
        this.newIndex = 0;
        this.oldIndex = 0;
        this.activeIndex = -1;
    }

    public TemplateModel stackBackword() {
        if (isBackwordEnable()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = (this.activeIndex + 4) % 5;
            this.activeIndex = i;
            TemplateModel templateModel = (TemplateModel) GSON.fromJson(this.stack[i], TemplateModel.class);
            HwLog.d(HwLog.TAG, "stackBackword cost stat" + (System.currentTimeMillis() - jCurrentTimeMillis));
            return templateModel;
        }
        HwLog.e(HwLog.TAG, "stackBackword wrong state oldIndex is " + this.oldIndex + " newIndex is " + this.newIndex + " activeIndex is " + this.activeIndex);
        return null;
    }

    public TemplateModel stackForword() {
        if (isForwordEnable()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = (this.activeIndex + 1) % 5;
            this.activeIndex = i;
            TemplateModel templateModel = (TemplateModel) GSON.fromJson(this.stack[i], TemplateModel.class);
            HwLog.d(HwLog.TAG, "stackForword cost stat" + (System.currentTimeMillis() - jCurrentTimeMillis));
            return templateModel;
        }
        HwLog.e(HwLog.TAG, "stackForword wrong state oldIndex is " + this.oldIndex + " newIndex is " + this.newIndex + " activeIndex is " + this.activeIndex);
        return null;
    }
}
