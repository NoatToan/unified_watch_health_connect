package defpackage;

import com.google.gson.Gson;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketing.datatype.templates.TextGeneralTemplate;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.operation.base.BaseOperation;
import com.huawei.ui.homehealth.operation.deviceempty.bean.EmptyDeviceResource;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class srw extends BaseOperation<EmptyDeviceResource> {
    @Override // com.huawei.ui.homehealth.operation.base.BaseOperation
    public int getPositionId() {
        return 4156;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.homehealth.operation.base.BaseOperation
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public EmptyDeviceResource generateResource(Gson gson, List<ResourceBriefInfo> list) {
        EmptyDeviceResource emptyDeviceResource = new EmptyDeviceResource();
        emptyDeviceResource.a(System.currentTimeMillis());
        for (ResourceBriefInfo resourceBriefInfo : list) {
            String content = resourceBriefInfo.getContent().getContent();
            LogUtil.a("DeviceEmptyOperation", content);
            int contentType = resourceBriefInfo.getContentType();
            if (contentType == 3) {
                TextGeneralTemplate textGeneralTemplate = (TextGeneralTemplate) gson.fromJson(content, TextGeneralTemplate.class);
                emptyDeviceResource.e(textGeneralTemplate.getLinkValue());
                emptyDeviceResource.d(textGeneralTemplate.getTheme());
                emptyDeviceResource.j(resourceBriefInfo.getResourceId());
                emptyDeviceResource.f(resourceBriefInfo.getResourceName());
                emptyDeviceResource.i(textGeneralTemplate.getTheme());
            } else if (contentType == 123) {
                List<SingleGridContent> gridContents = ((GridTemplate) gson.fromJson(content, GridTemplate.class)).getGridContents();
                if (!CollectionUtils.a(gridContents)) {
                    emptyDeviceResource.c(gridContents.get(0).getLinkValue());
                    emptyDeviceResource.g(gridContents.get(0).getPicture());
                    emptyDeviceResource.a(resourceBriefInfo.getResourceId());
                    emptyDeviceResource.h(resourceBriefInfo.getResourceName());
                    emptyDeviceResource.b(gridContents.get(0).getPicture());
                }
            }
        }
        return emptyDeviceResource;
    }

    @Override // com.huawei.ui.homehealth.operation.base.BaseOperation
    public String getSpCacheKey() {
        return "EMPTY_DEVICE_RESOURCE_SP";
    }

    @Override // com.huawei.ui.homehealth.operation.base.BaseOperation
    public Type getResourceType() {
        return EmptyDeviceResource.class;
    }

    @Override // com.huawei.ui.homehealth.operation.base.BaseOperation
    public String getTag() {
        return "DeviceEmptyOperation";
    }
}
