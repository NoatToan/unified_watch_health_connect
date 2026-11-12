package com.huami.tools.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
class n implements q {
    private static final String d = "HmStat-LocalRecorder";
    private Executor a;
    private f b;
    private e c;

    public n(@NonNull Executor executor, @NonNull f fVar, @NonNull e eVar) {
        this.a = executor;
        this.b = fVar;
        this.c = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Event event) {
        try {
            d dVarA = this.c.a();
            boolean zHasContext = this.b.hasContext(dVarA.a);
            if (!zHasContext) {
                zHasContext = this.b.insertContext(dVarA);
            }
            if (zHasContext) {
                event.setContextId(dVarA.a);
                this.b.insertEvent(event);
                return;
            }
            p.b().w(d, "上下文保存失败，无法记录当前事件，直接丢弃。 " + event);
        } catch (Exception e) {
            p.b().w(d, e, "记录事件发生异常。" + event);
        }
    }

    @Override // com.huami.tools.analytics.q
    public void a(@Nullable final Event event) {
        if (event == null) {
            p.b().v(d, "无数据，不记录");
        } else {
            if (k.a(event)) {
                return;
            }
            this.a.execute(new Runnable() { // from class: com.huami.tools.analytics.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(event);
                }
            });
        }
    }
}
