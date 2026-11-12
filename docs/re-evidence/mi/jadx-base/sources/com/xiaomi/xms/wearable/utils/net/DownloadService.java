package com.xiaomi.xms.wearable.utils.net;

import defpackage.djo;
import defpackage.kdq;
import defpackage.o4h;
import defpackage.prk;
import defpackage.uua;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/xms/wearable/utils/net/DownloadService;", "", "", "url", "Lo4h;", "Lprk;", "Lokhttp3/ResponseBody;", "downloadFace", "(Ljava/lang/String;)Lo4h;", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
public interface DownloadService {
    @djo
    @NotNull
    @uua
    o4h<prk<ResponseBody>> downloadFace(@kdq @NotNull String url);
}
