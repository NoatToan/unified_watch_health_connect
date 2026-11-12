package io.sentry.rrweb;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class RRWebInteractionEvent extends RRWebIncrementalSnapshotEvent implements cud {

    @Nullable
    public InteractionType d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;

    @Nullable
    public Map<String, Object> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f21832k;

    public enum InteractionType implements cud {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

        public static final class a implements fsd<InteractionType> {
            @Override // defpackage.fsd
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public InteractionType a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
                return InteractionType.values()[f4hVar.nextInt()];
            }
        }

        @Override // defpackage.cud
        public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
            h4hVar.d(ordinal());
        }
    }

    public static final class a implements fsd<RRWebInteractionEvent> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RRWebInteractionEvent a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            RRWebInteractionEvent rRWebInteractionEvent = new RRWebInteractionEvent();
            b.a aVar = new b.a();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("data")) {
                    c(rRWebInteractionEvent, f4hVar, iLogger);
                } else if (!aVar.a(rRWebInteractionEvent, strNextName, f4hVar, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    f4hVar.l0(iLogger, map, strNextName);
                }
            }
            rRWebInteractionEvent.t(map);
            f4hVar.endObject();
            return rRWebInteractionEvent;
        }

        public final void c(@NotNull RRWebInteractionEvent rRWebInteractionEvent, @NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            RRWebIncrementalSnapshotEvent.a aVar = new RRWebIncrementalSnapshotEvent.a();
            f4hVar.beginObject();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "x":
                        rRWebInteractionEvent.f = f4hVar.nextFloat();
                        break;
                    case "y":
                        rRWebInteractionEvent.g = f4hVar.nextFloat();
                        break;
                    case "id":
                        rRWebInteractionEvent.e = f4hVar.nextInt();
                        break;
                    case "type":
                        rRWebInteractionEvent.d = (InteractionType) f4hVar.A(iLogger, new InteractionType.a());
                        break;
                    case "pointerType":
                        rRWebInteractionEvent.h = f4hVar.nextInt();
                        break;
                    case "pointerId":
                        rRWebInteractionEvent.i = f4hVar.nextInt();
                        break;
                    default:
                        if (!aVar.a(rRWebInteractionEvent, strNextName, f4hVar, iLogger)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            f4hVar.l0(iLogger, map, strNextName);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            rRWebInteractionEvent.p(map);
            f4hVar.endObject();
        }
    }

    public RRWebInteractionEvent() {
        super(RRWebIncrementalSnapshotEvent.IncrementalSource.MouseInteraction);
        this.h = 2;
    }

    private void o(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        new RRWebIncrementalSnapshotEvent.b().a(this, h4hVar, iLogger);
        h4hVar.g("type").j(iLogger, this.d);
        h4hVar.g("id").d(this.e);
        h4hVar.g("x").e(this.f);
        h4hVar.g("y").e(this.g);
        h4hVar.g("pointerType").d(this.h);
        h4hVar.g("pointerId").d(this.i);
        Map<String, Object> map = this.f21832k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21832k.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public void p(@Nullable Map<String, Object> map) {
        this.f21832k = map;
    }

    public void q(int i) {
        this.e = i;
    }

    public void r(@Nullable InteractionType interactionType) {
        this.d = interactionType;
    }

    public void s(int i) {
        this.i = i;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        new b.C0972b().a(this, h4hVar, iLogger);
        h4hVar.g("data");
        o(h4hVar, iLogger);
        Map<String, Object> map = this.j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.j.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public void t(@Nullable Map<String, Object> map) {
        this.j = map;
    }

    public void u(float f) {
        this.f = f;
    }

    public void v(float f) {
        this.g = f;
    }
}
