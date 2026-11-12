package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec;

import com.huawei.watchface.videoedit.param.PlayerBean;
import com.huawei.watchface.videoedit.param.TemplateModel;
import com.huawei.watchface.videoedit.presenter.AudioPlayVisitor;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class AudioModel {
    private static final String TAG = "AudioModel";
    private PlayerBean mActivePlayerBean;
    private TemplateModel mModel;
    private AudioPlayVisitor mVisitor = new AudioPlayVisitor(0, "audio");

    public void prepare(TemplateModel templateModel) {
        this.mModel = templateModel;
        this.mVisitor.onDataSetChanged(templateModel);
        update(0);
    }

    public long getDuration() {
        TemplateModel templateModel = this.mModel;
        if (templateModel != null) {
            return templateModel.getDuration();
        }
        return 0L;
    }

    public void update(int i) {
        List<PlayerBean> playerBeansByTime = this.mVisitor.getVisitorModel().getPlayerBeansByTime(i, "audio");
        if (playerBeansByTime.isEmpty()) {
            return;
        }
        PlayerBean playerBean = playerBeansByTime.get(0);
        if (playerBean.equals(this.mActivePlayerBean)) {
            return;
        }
        LogUtil.b(TAG, "update bgm changed at ", Integer.valueOf(i));
        this.mActivePlayerBean = playerBean;
    }
}
