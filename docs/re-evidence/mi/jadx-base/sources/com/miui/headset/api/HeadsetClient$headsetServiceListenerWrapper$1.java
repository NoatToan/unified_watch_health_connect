package com.miui.headset.api;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/miui/headset/api/HeadsetClient$headsetServiceListenerWrapper$1", "Lcom/miui/headset/api/HeadsetServiceListener;", "onHeadsetServiceDied", "", "onHeadsetServiceInitialized", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHeadsetClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeadsetClient.kt\ncom/miui/headset/api/HeadsetClient$headsetServiceListenerWrapper$1\n+ 2 Kit.kt\ncom/miui/headset/api/KitKt\n*L\n1#1,578:1\n49#2:579\n33#2:580\n27#2:581\n50#2:582\n49#2:583\n33#2:584\n27#2:585\n50#2:586\n*S KotlinDebug\n*F\n+ 1 HeadsetClient.kt\ncom/miui/headset/api/HeadsetClient$headsetServiceListenerWrapper$1\n*L\n113#1:579\n113#1:580\n113#1:581\n113#1:582\n118#1:583\n118#1:584\n118#1:585\n118#1:586\n*E\n"})
public final class HeadsetClient$headsetServiceListenerWrapper$1 implements HeadsetServiceListener {
    final /* synthetic */ HeadsetClient this$0;

    public HeadsetClient$headsetServiceListenerWrapper$1(HeadsetClient headsetClient) {
        this.this$0 = headsetClient;
    }

    @Override // com.miui.headset.api.HeadsetServiceListener
    public void onHeadsetServiceDied() {
        String tag = this.this$0.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb.append(tag);
        sb.append(' ');
        sb.append((Object) "onHeadsetServiceDied");
        this.this$0.headsetServiceListener.onHeadsetServiceDied();
    }

    @Override // com.miui.headset.api.HeadsetServiceListener
    public void onHeadsetServiceInitialized() {
        String tag = this.this$0.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb.append(tag);
        sb.append(' ');
        sb.append((Object) "onHeadsetServiceInitialized");
        this.this$0.headsetServiceListener.onHeadsetServiceInitialized();
    }
}
