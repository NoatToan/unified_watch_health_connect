package com.careforeyou.library.protocal;

import com.careforeyou.library.bean.CsFatScale;
import com.careforeyou.library.enums.EnumProcessResult;
import defpackage.vs;

/* JADX INFO: loaded from: classes4.dex */
public interface iStraightFrame {
    CsFatScale getFatScale();

    EnumProcessResult process(byte[] bArr, String str) throws vs;
}
