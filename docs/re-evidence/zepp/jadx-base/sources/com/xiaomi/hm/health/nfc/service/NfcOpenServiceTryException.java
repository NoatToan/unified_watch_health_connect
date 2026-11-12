package com.xiaomi.hm.health.nfc.service;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H\u0002J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u0016\u0010\u0011\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceTryException;", "Lcom/xiaomi/hm/health/nfc/service/INfcOpenService;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "action", "a", "", "", "info", "Lcom/xiaomi/hm/health/nfc/service/SeInfoEntity;", "getSeId", "Lcom/xiaomi/hm/health/nfc/service/CardInfoEntity;", "queryCardInfo", "", "deleteCard", "Lcom/xiaomi/hm/health/nfc/service/INfcOpenService;", "api", "<init>", "(Lcom/xiaomi/hm/health/nfc/service/INfcOpenService;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NfcOpenServiceTryException implements INfcOpenService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcOpenService api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<NfcOpenServiceResponse<Unit>> {
        public final /* synthetic */ Map<Object, Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<Object, ? extends Object> map) {
            super(0);
            this.b = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NfcOpenServiceResponse<Unit> invoke() {
            return NfcOpenServiceTryException.this.api.deleteCard(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "Lcom/xiaomi/hm/health/nfc/service/SeInfoEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<NfcOpenServiceResponse<SeInfoEntity>> {
        public final /* synthetic */ Map<Object, Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<Object, ? extends Object> map) {
            super(0);
            this.b = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NfcOpenServiceResponse<SeInfoEntity> invoke() {
            return NfcOpenServiceTryException.this.api.getSeId(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "Lcom/xiaomi/hm/health/nfc/service/CardInfoEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<NfcOpenServiceResponse<CardInfoEntity>> {
        public final /* synthetic */ Map<Object, Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map<Object, ? extends Object> map) {
            super(0);
            this.b = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NfcOpenServiceResponse<CardInfoEntity> invoke() {
            return NfcOpenServiceTryException.this.api.queryCardInfo(this.b);
        }
    }

    public NfcOpenServiceTryException(@NotNull INfcOpenService iNfcOpenService) {
        this.api = iNfcOpenService;
    }

    private final <T> NfcOpenServiceResponse<T> a(Function0<NfcOpenServiceResponse<T>> action) {
        try {
            return action.invoke();
        } catch (Exception e) {
            return NfcOpenServiceResponse.INSTANCE.error(99, e.getMessage());
        }
    }

    @Override // com.xiaomi.hm.health.nfc.service.INfcOpenService
    @NotNull
    public NfcOpenServiceResponse<Unit> deleteCard(@NotNull Map<Object, ? extends Object> info) {
        return a(new a(info));
    }

    @Override // com.xiaomi.hm.health.nfc.service.INfcOpenService
    @NotNull
    public NfcOpenServiceResponse<SeInfoEntity> getSeId(@NotNull Map<Object, ? extends Object> info) {
        return a(new b(info));
    }

    @Override // com.xiaomi.hm.health.nfc.service.INfcOpenService
    @NotNull
    public NfcOpenServiceResponse<CardInfoEntity> queryCardInfo(@NotNull Map<Object, ? extends Object> info) {
        return a(new c(info));
    }
}
