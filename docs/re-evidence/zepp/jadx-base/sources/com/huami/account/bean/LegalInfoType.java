package com.huami.account.bean;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/huami/account/bean/LegalInfoType;", "", "Lcom/huami/account/bean/NavigateAgreementType;", "toNavigateType", "", "typeName", "Ljava/lang/String;", "getTypeName", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "AGREEMENT", "PRIVACY", "EXPERIENCE", "accountui_release"}, k = 1, mv = {1, 5, 1})
public enum LegalInfoType {
    AGREEMENT("agreement"),
    PRIVACY("privacy"),
    EXPERIENCE("experience");


    @NotNull
    private final String typeName;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegalInfoType.values().length];
            iArr[LegalInfoType.AGREEMENT.ordinal()] = 1;
            iArr[LegalInfoType.PRIVACY.ordinal()] = 2;
            iArr[LegalInfoType.EXPERIENCE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    LegalInfoType(String str) {
        this.typeName = str;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    @NotNull
    public final NavigateAgreementType toNavigateType() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return NavigateAgreementType.AGREEMENT;
        }
        if (i == 2) {
            return NavigateAgreementType.PRIVACY;
        }
        if (i == 3) {
            return NavigateAgreementType.EXPERIENCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
