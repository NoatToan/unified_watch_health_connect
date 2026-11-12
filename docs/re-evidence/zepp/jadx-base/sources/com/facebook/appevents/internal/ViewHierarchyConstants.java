package com.facebook.appevents.internal;

import androidx.annotation.RestrictTo;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b>\u0010?R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0016\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0016\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0004R\u0016\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0004R\u0016\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0004R\u0016\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0004R\u0016\u00100\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00104\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u00101R\u0016\u00105\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u00101R\u0016\u00106\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u00101R\u0016\u00107\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u00101R\u0016\u00108\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u00101R\u0016\u00109\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u00101R\u0016\u0010:\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u00101R\u0016\u0010;\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u00101R\u0016\u0010<\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u00101R\u0016\u0010=\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u00101¨\u0006@"}, d2 = {"Lcom/facebook/appevents/internal/ViewHierarchyConstants;", "", "", "ID_KEY", "Ljava/lang/String;", "CLASS_NAME_KEY", "CLASS_TYPE_BITMASK_KEY", "TEXT_KEY", "DESC_KEY", "DIMENSION_KEY", "IS_USER_INPUT_KEY", "TAG_KEY", "CHILDREN_VIEW_KEY", "HINT_KEY", "DIMENSION_TOP_KEY", "DIMENSION_LEFT_KEY", "DIMENSION_WIDTH_KEY", "DIMENSION_HEIGHT_KEY", "DIMENSION_SCROLL_X_KEY", "DIMENSION_SCROLL_Y_KEY", "DIMENSION_VISIBILITY_KEY", "TEXT_SIZE", "TEXT_IS_BOLD", "TEXT_IS_ITALIC", "TEXT_STYLE", "ICON_BITMAP", "INPUT_TYPE_KEY", "IS_INTERACTED_KEY", "SCREEN_NAME_KEY", "VIEW_KEY", ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.GERMAN, ViewHierarchyConstants.SPANISH, ViewHierarchyConstants.JAPANESE, ViewHierarchyConstants.VIEW_CONTENT, ViewHierarchyConstants.SEARCH, ViewHierarchyConstants.ADD_TO_CART, ViewHierarchyConstants.ADD_TO_WISHLIST, ViewHierarchyConstants.INITIATE_CHECKOUT, ViewHierarchyConstants.ADD_PAYMENT_INFO, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_TEXT, ViewHierarchyConstants.PAGE_TITLE, ViewHierarchyConstants.RESOLVED_DOCUMENT_LINK, ViewHierarchyConstants.BUTTON_ID, "", "TEXTVIEW_BITMASK", LogUtil.I, "IMAGEVIEW_BITMASK", "BUTTON_BITMASK", "CLICKABLE_VIEW_BITMASK", "REACT_NATIVE_BUTTON_BITMASK", "ADAPTER_VIEW_ITEM_BITMASK", "LABEL_BITMASK", "INPUT_BITMASK", "PICKER_BITMASK", "SWITCH_BITMASK", "RADIO_GROUP_BITMASK", "CHECKBOX_BITMASK", "RATINGBAR_BITMASK", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ViewHierarchyConstants {
    public static final int ADAPTER_VIEW_ITEM_BITMASK = 9;

    @NotNull
    public static final String ADD_PAYMENT_INFO = "ADD_PAYMENT_INFO";

    @NotNull
    public static final String ADD_TO_CART = "ADD_TO_CART";

    @NotNull
    public static final String ADD_TO_WISHLIST = "ADD_TO_WISHLIST";
    public static final int BUTTON_BITMASK = 2;

    @NotNull
    public static final String BUTTON_ID = "BUTTON_ID";

    @NotNull
    public static final String BUTTON_TEXT = "BUTTON_TEXT";
    public static final int CHECKBOX_BITMASK = 15;

    @NotNull
    public static final String CHILDREN_VIEW_KEY = "childviews";

    @NotNull
    public static final String CLASS_NAME_KEY = "classname";

    @NotNull
    public static final String CLASS_TYPE_BITMASK_KEY = "classtypebitmask";
    public static final int CLICKABLE_VIEW_BITMASK = 5;

    @NotNull
    public static final String COMPLETE_REGISTRATION = "COMPLETE_REGISTRATION";

    @NotNull
    public static final String DESC_KEY = "description";

    @NotNull
    public static final String DIMENSION_HEIGHT_KEY = "height";

    @NotNull
    public static final String DIMENSION_KEY = "dimension";

    @NotNull
    public static final String DIMENSION_LEFT_KEY = "left";

    @NotNull
    public static final String DIMENSION_SCROLL_X_KEY = "scrollx";

    @NotNull
    public static final String DIMENSION_SCROLL_Y_KEY = "scrolly";

    @NotNull
    public static final String DIMENSION_TOP_KEY = "top";

    @NotNull
    public static final String DIMENSION_VISIBILITY_KEY = "visibility";

    @NotNull
    public static final String DIMENSION_WIDTH_KEY = "width";

    @NotNull
    public static final String ENGLISH = "ENGLISH";

    @NotNull
    public static final String GERMAN = "GERMAN";

    @NotNull
    public static final String HINT_KEY = "hint";

    @NotNull
    public static final String ICON_BITMAP = "icon_image";

    @NotNull
    public static final String ID_KEY = "id";
    public static final int IMAGEVIEW_BITMASK = 1;

    @NotNull
    public static final String INITIATE_CHECKOUT = "INITIATE_CHECKOUT";
    public static final int INPUT_BITMASK = 11;

    @NotNull
    public static final String INPUT_TYPE_KEY = "inputtype";

    @NotNull
    public static final ViewHierarchyConstants INSTANCE = new ViewHierarchyConstants();

    @NotNull
    public static final String IS_INTERACTED_KEY = "is_interacted";

    @NotNull
    public static final String IS_USER_INPUT_KEY = "is_user_input";

    @NotNull
    public static final String JAPANESE = "JAPANESE";
    public static final int LABEL_BITMASK = 10;

    @NotNull
    public static final String LEAD = "LEAD";

    @NotNull
    public static final String PAGE_TITLE = "PAGE_TITLE";
    public static final int PICKER_BITMASK = 12;

    @NotNull
    public static final String PURCHASE = "PURCHASE";
    public static final int RADIO_GROUP_BITMASK = 14;
    public static final int RATINGBAR_BITMASK = 16;
    public static final int REACT_NATIVE_BUTTON_BITMASK = 6;

    @NotNull
    public static final String RESOLVED_DOCUMENT_LINK = "RESOLVED_DOCUMENT_LINK";

    @NotNull
    public static final String SCREEN_NAME_KEY = "screenname";

    @NotNull
    public static final String SEARCH = "SEARCH";

    @NotNull
    public static final String SPANISH = "SPANISH";
    public static final int SWITCH_BITMASK = 13;

    @NotNull
    public static final String TAG_KEY = "tag";
    public static final int TEXTVIEW_BITMASK = 0;

    @NotNull
    public static final String TEXT_IS_BOLD = "is_bold";

    @NotNull
    public static final String TEXT_IS_ITALIC = "is_italic";

    @NotNull
    public static final String TEXT_KEY = "text";

    @NotNull
    public static final String TEXT_SIZE = "font_size";

    @NotNull
    public static final String TEXT_STYLE = "text_style";

    @NotNull
    public static final String VIEW_CONTENT = "VIEW_CONTENT";

    @NotNull
    public static final String VIEW_KEY = "view";

    private ViewHierarchyConstants() {
    }
}
