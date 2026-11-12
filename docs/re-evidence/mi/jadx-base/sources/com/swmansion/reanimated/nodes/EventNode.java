package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import defpackage.pvg;
import defpackage.qnq;
import defpackage.svg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class EventNode extends pvg implements RCTEventEmitter {
    private final List<a> mMapping;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f10658b;

        public a(ReadableArray readableArray) {
            int size = readableArray.size() - 1;
            this.f10658b = new String[size];
            for (int i = 0; i < size; i++) {
                this.f10658b[i] = readableArray.getString(i);
            }
            this.f10657a = readableArray.getInt(size);
        }

        public Double b(ReadableMap readableMap) {
            int i = 0;
            while (readableMap != null) {
                String[] strArr = this.f10658b;
                if (i >= strArr.length - 1) {
                    break;
                }
                String str = strArr[i];
                readableMap = readableMap.hasKey(str) ? readableMap.getMap(str) : null;
                i++;
            }
            if (readableMap == null) {
                return null;
            }
            String[] strArr2 = this.f10658b;
            String str2 = strArr2[strArr2.length - 1];
            if (readableMap.hasKey(str2)) {
                return Double.valueOf(readableMap.getDouble(str2));
            }
            return null;
        }
    }

    public EventNode(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.mMapping = processMapping(readableMap.getArray("argMapping"));
    }

    private static List<a> processMapping(ReadableArray readableArray) {
        int size = readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(readableArray.getArray(i)));
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        if (writableMap == null) {
            throw new IllegalArgumentException("Animated events must have event data.");
        }
        for (int i2 = 0; i2 < this.mMapping.size(); i2++) {
            a aVar = this.mMapping.get(i2);
            Double dB = aVar.b(writableMap);
            if (dB != null) {
                ((qnq) this.mNodesManager.o(aVar.f10657a, qnq.class)).b(dB);
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new RuntimeException("receiveTouches is not support by animated events");
    }

    @Override // defpackage.pvg
    public Double evaluate() {
        return pvg.ZERO;
    }
}
