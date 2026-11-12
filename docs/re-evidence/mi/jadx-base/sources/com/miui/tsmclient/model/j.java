package com.miui.tsmclient.model;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.entity.CardInfo;
import com.tsmclient.smartcard.terminal.IScTerminal;

/* JADX INFO: loaded from: classes6.dex */
public interface j<T extends CardInfo> extends com.miui.tsmclient.a {
    BaseResponse a(Context context, T t);

    BaseResponse a(Context context, T t, Bundle bundle);

    BaseResponse a(Context context, IScTerminal iScTerminal, Bundle bundle);

    BaseResponse b(Context context, T t);

    BaseResponse b(Context context, T t, Bundle bundle);

    BaseResponse c(Context context, T t);

    BaseResponse c(Context context, T t, Bundle bundle);

    BaseResponse d(Context context, T t, Bundle bundle);

    BaseResponse e(Context context, T t, Bundle bundle);

    BaseResponse f(Context context, T t, Bundle bundle);

    BaseResponse g(Context context, T t, Bundle bundle);

    BaseResponse h(Context context, T t, Bundle bundle);

    BaseResponse i(Context context, T t, Bundle bundle);

    BaseResponse j(Context context, T t, Bundle bundle);

    BaseResponse k(Context context, T t, Bundle bundle);

    BaseResponse l(Context context, T t, Bundle bundle);

    BaseResponse m(Context context, T t, Bundle bundle);
}
