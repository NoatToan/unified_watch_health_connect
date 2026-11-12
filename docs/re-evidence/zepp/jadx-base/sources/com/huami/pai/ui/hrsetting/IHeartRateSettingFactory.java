package com.huami.pai.ui.hrsetting;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/pai/ui/hrsetting/IHeartRateSettingFactory;", "", "", "strategy", "Lcom/huami/pai/ui/hrsetting/IHeartRateSetting;", "getHrDevice", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IHeartRateSettingFactory {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ IHeartRateSetting getHrDevice$default(IHeartRateSettingFactory iHeartRateSettingFactory, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHrDevice");
            }
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return iHeartRateSettingFactory.getHrDevice(i);
        }
    }

    @NotNull
    IHeartRateSetting getHrDevice(int strategy);
}
