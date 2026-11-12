package com.huami.sleepassistant.apilib.utils;

import com.huami.sleepassistant.apilib.vo.MusicVo;

/* JADX INFO: loaded from: classes13.dex */
public interface OnDownLoadStatusCallBack {
    void callback(MusicVo musicVo);

    void downFail();

    void endDown();

    void startDown();
}
