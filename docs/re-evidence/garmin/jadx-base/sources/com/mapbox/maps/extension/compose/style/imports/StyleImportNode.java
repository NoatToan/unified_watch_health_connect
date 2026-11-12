package com.mapbox.maps.extension.compose.style.imports;

import android.webkit.URLUtil;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.ImportPosition;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.extension.compose.internal.MapNode;
import com.mapbox.maps.extension.compose.style.ImportConfigs;
import com.mapbox.maps.extension.compose.style.StyleColorTheme;
import com.mapbox.maps.extension.compose.style.internal.MapStyleNode;
import d53.u;
import e23.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import r53.d2;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 22\u00020\u0001:\u00012B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u0019\u0010#\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b'\u0010\u001aJ\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u000fJ\u000f\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/imports/StyleImportNode;", "Lcom/mapbox/maps/extension/compose/internal/MapNode;", "", "importId", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/extension/compose/style/ImportConfigs;", "config", "Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;", "styleColorTheme", "Lo53/b0;", "coroutineScope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/compose/style/ImportConfigs;Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;Lo53/b0;)V", "", "addStyleImport", "()V", "removeStyleImport", "Lcom/mapbox/maps/ImportPosition;", "getRelativePositionInfo", "()Lcom/mapbox/maps/ImportPosition;", "cleanUp", "", "isValidUri", "(Ljava/lang/String;)Z", "parent", "onAttached", "(Lcom/mapbox/maps/extension/compose/internal/MapNode;)V", "updateImportId$extension_compose_release", "(Ljava/lang/String;)V", "updateImportId", "updateStyle$extension_compose_release", "updateStyle", "configs", "updateConfigs$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/ImportConfigs;)V", "updateConfigs", "updateColorTheme$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;)V", "updateColorTheme", "onRemoved", "onClear", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Lcom/mapbox/maps/extension/compose/style/ImportConfigs;", "Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;", "Lo53/b0;", "Lcom/mapbox/maps/extension/compose/style/internal/MapStyleNode;", "mapStyleNode", "Lcom/mapbox/maps/extension/compose/style/internal/MapStyleNode;", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StyleImportNode extends MapNode {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "StyleImportNode";
    private ImportConfigs config;
    private final b0 coroutineScope;
    private String importId;
    private MapStyleNode mapStyleNode;
    private String style;
    private StyleColorTheme styleColorTheme;

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.imports.StyleImportNode$addStyleImport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
    @e(c = "com.mapbox.maps.extension.compose.style.imports.StyleImportNode$addStyleImport$1", f = "StyleImportsScope.kt", l = {44}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ MapboxMap $mapboxMap;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MapboxMap mapboxMap, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$mapboxMap = mapboxMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2$lambda$0(String str) {
            str.getClass();
            MapboxLogger.logE(StyleImportNode.TAG, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2$lambda$1(StyleImportNode styleImportNode, None none) {
            MapboxLogger.logD(StyleImportNode.TAG, "added StyleImport(" + styleImportNode.importId + ", " + styleImportNode.style + ", " + styleImportNode.config + ", null)");
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return StyleImportNode.this.new AnonymousClass1(this.$mapboxMap, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Expected<String, None> expectedAddStyleImportFromJSON;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                MapStyleNode mapStyleNode = StyleImportNode.this.mapStyleNode;
                if (mapStyleNode == null) {
                    s.m("mapStyleNode");
                    throw null;
                }
                d2<StyleDataLoaded> styleDataLoaded$extension_compose_release = mapStyleNode.getStyleDataLoaded$extension_compose_release();
                this.label = 1;
                obj = r53.s.y(styleDataLoaded$extension_compose_release, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            final StyleImportNode styleImportNode = StyleImportNode.this;
            MapboxMap mapboxMap = this.$mapboxMap;
            if (styleImportNode.isValidUri(styleImportNode.style)) {
                String str = styleImportNode.importId;
                String str2 = styleImportNode.style;
                ImportConfigs importConfigs = styleImportNode.config;
                expectedAddStyleImportFromJSON = mapboxMap.addStyleImportFromURI(str, str2, importConfigs != null ? importConfigs.getConfigs$extension_compose_release() : null, styleImportNode.getRelativePositionInfo());
            } else {
                MapStyleNode mapStyleNode2 = styleImportNode.mapStyleNode;
                if (mapStyleNode2 == null) {
                    s.m("mapStyleNode");
                    throw null;
                }
                MapboxMap mapboxMap2 = mapStyleNode2.getMapboxMap();
                String str3 = styleImportNode.importId;
                String str4 = styleImportNode.style;
                ImportConfigs importConfigs2 = styleImportNode.config;
                expectedAddStyleImportFromJSON = mapboxMap2.addStyleImportFromJSON(str3, str4, importConfigs2 != null ? importConfigs2.getConfigs$extension_compose_release() : null, styleImportNode.getRelativePositionInfo());
            }
            expectedAddStyleImportFromJSON.onError(new a()).onValue(new Expected.Action() { // from class: com.mapbox.maps.extension.compose.style.imports.b
                @Override // com.mapbox.bindgen.Expected.Action
                public final void run(Object obj2) {
                    StyleImportNode.AnonymousClass1.invokeSuspend$lambda$2$lambda$1(styleImportNode, (None) obj2);
                }
            });
            if (!styleImportNode.styleColorTheme.isStyleDefault$extension_compose_release()) {
                mapboxMap.setImportColorTheme(styleImportNode.importId, styleImportNode.styleColorTheme.getColorTheme());
            }
            return Unit.INSTANCE;
        }
    }

    public StyleImportNode(String str, String str2, ImportConfigs importConfigs, StyleColorTheme styleColorTheme, b0 b0Var) {
        str.getClass();
        str2.getClass();
        styleColorTheme.getClass();
        b0Var.getClass();
        this.importId = str;
        this.style = str2;
        this.config = importConfigs;
        this.styleColorTheme = styleColorTheme;
        this.coroutineScope = b0Var;
    }

    private final void addStyleImport() {
        MapStyleNode mapStyleNode = this.mapStyleNode;
        if (mapStyleNode == null) {
            s.m("mapStyleNode");
            throw null;
        }
        ge1.b.T(this.coroutineScope, null, null, new AnonymousClass1(mapStyleNode.getMapboxMap(), null), 3);
    }

    private final void cleanUp() {
        removeStyleImport();
        Iterator<T> it = getChildren().iterator();
        while (it.hasNext()) {
            ((MapNode) it.next()).onClear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImportPosition getRelativePositionInfo() {
        MapStyleNode mapStyleNode = this.mapStyleNode;
        if (mapStyleNode == null) {
            s.m("mapStyleNode");
            throw null;
        }
        List<MapNode> children = mapStyleNode.getChildren();
        ArrayList arrayList = new ArrayList();
        for (Object obj : children) {
            if (obj instanceof StyleImportNode) {
                arrayList.add(obj);
            }
        }
        StyleImportNode styleImportNode = (StyleImportNode) h0.e0(arrayList.indexOf(this) + 1, arrayList);
        return new ImportPosition(null, styleImportNode != null ? styleImportNode.importId : null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValidUri(String str) {
        return u.y(str, "mapbox://", true) || u.y(str, "asset://", true) || u.y(str, "file://", true) || URLUtil.isValidUrl(str);
    }

    private final void removeStyleImport() {
        MapStyleNode mapStyleNode = this.mapStyleNode;
        if (mapStyleNode != null) {
            mapStyleNode.getMapboxMap().removeStyleImport(this.importId);
        } else {
            s.m("mapStyleNode");
            throw null;
        }
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onAttached(MapNode parent) {
        parent.getClass();
        MapboxLogger.logD(TAG, "onAttached");
        this.mapStyleNode = (MapStyleNode) parent;
        addStyleImport();
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onClear() {
        cleanUp();
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onRemoved(MapNode parent) {
        parent.getClass();
        cleanUp();
    }

    public String toString() {
        return a0.m(new StringBuilder("StyleImportNode(importId="), this.importId, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final void updateColorTheme$extension_compose_release(StyleColorTheme styleColorTheme) {
        styleColorTheme.getClass();
        MapStyleNode mapStyleNode = this.mapStyleNode;
        if (mapStyleNode != null) {
            mapStyleNode.getMapboxMap().setImportColorTheme(this.importId, styleColorTheme.getColorTheme());
        } else {
            s.m("mapStyleNode");
            throw null;
        }
    }

    public final void updateConfigs$extension_compose_release(ImportConfigs configs) {
        HashMap<String, Value> map;
        MapStyleNode mapStyleNode = this.mapStyleNode;
        if (mapStyleNode == null) {
            s.m("mapStyleNode");
            throw null;
        }
        MapboxMap mapboxMap = mapStyleNode.getMapboxMap();
        String str = this.importId;
        if (configs == null || (map = configs.getConfigs$extension_compose_release()) == null) {
            map = new HashMap<>();
        }
        mapboxMap.setStyleImportConfigProperties(str, map);
    }

    public final void updateImportId$extension_compose_release(String importId) {
        importId.getClass();
        removeStyleImport();
        this.importId = importId;
        addStyleImport();
    }

    public final void updateStyle$extension_compose_release(String style) {
        style.getClass();
        removeStyleImport();
        this.style = style;
        addStyleImport();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/imports/StyleImportNode$Companion;", "", "()V", "TAG", "", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }
}
