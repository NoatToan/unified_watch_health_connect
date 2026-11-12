package com.huawei.health;

import com.huawei.haf.router.facade.service.SerializationService;
import com.huawei.haf.router.facade.template.SyringeHandler;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes23.dex */
public final class MainActivity$$AppRouter$$Autowired implements SyringeHandler {
    @Override // com.huawei.haf.router.facade.template.SyringeHandler
    public void inject(Object obj, SerializationService serializationService) {
        MainActivity mainActivity = (MainActivity) obj;
        mainActivity.f6129a = mainActivity.getIntent().getExtras() == null ? mainActivity.f6129a : mainActivity.getIntent().getExtras().getString(Constants.HOME_TAB_NAME, mainActivity.f6129a);
        mainActivity.f6130c = mainActivity.getIntent().getIntExtra(BleConstants.SPORT_TYPE, mainActivity.f6130c);
    }
}
