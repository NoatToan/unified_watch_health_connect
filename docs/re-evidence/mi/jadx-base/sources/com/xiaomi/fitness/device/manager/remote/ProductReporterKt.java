package com.xiaomi.fitness.device.manager.remote;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.onetrack.OneTrack;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¨\u0006\u0005"}, d2 = {"reportProductSyntax", "", "path", "", "message", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProductReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductReporter.kt\ncom/xiaomi/fitness/device/manager/remote/ProductReporterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public final class ProductReporterKt {
    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.String] */
    public static final void reportProductSyntax(@NotNull String path, @Nullable String str) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            Logger.i("reportProductSyntax() called with: message = " + str, new Object[0]);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            FileInputStream fileInputStream = new FileInputStream(path);
            try {
                Reader inputStreamReader = new InputStreamReader(fileInputStream, Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    ?? text = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    objectRef.element = text;
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                    OneTrackStatBean oneTrackStatBean = new OneTrackStatBean(OneTrack.Event.EXPOSE, "56.1.0.1.44389");
                    Object[] objArr = new Object[4];
                    objArr[0] = "value_str";
                    String str2 = (String) objectRef.element;
                    if (str2 == null) {
                        str2 = "";
                    }
                    objArr[1] = str2;
                    objArr[2] = "exception";
                    if (str == null) {
                        str = "";
                    }
                    objArr[3] = str;
                    oneTrackExtKt.reportData(oneTrackStatBean, objArr);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(fileInputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e) {
            DeviceModelExtKt.loge("reportProductSyntax ", e);
        }
    }
}
