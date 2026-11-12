package p006l2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll2/s1;", "", "", "editsText", "<init>", "(Ljava/lang/String;IZ)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum s1 {
    LEFT_CHAR(false),
    RIGHT_CHAR(false),
    RIGHT_WORD(false),
    LEFT_WORD(false),
    NEXT_PARAGRAPH(false),
    PREV_PARAGRAPH(false),
    LINE_START(false),
    LINE_END(false),
    LINE_LEFT(false),
    LINE_RIGHT(false),
    UP(false),
    DOWN(false),
    CENTER(false),
    PAGE_UP(false),
    PAGE_DOWN(false),
    HOME(false),
    END(false),
    COPY(false),
    PASTE(true),
    CUT(true),
    DELETE_PREV_CHAR(true),
    DELETE_NEXT_CHAR(true),
    DELETE_PREV_WORD(true),
    DELETE_NEXT_WORD(true),
    DELETE_FROM_LINE_START(true),
    DELETE_TO_LINE_END(true),
    SELECT_ALL(false),
    SELECT_LEFT_CHAR(false),
    SELECT_RIGHT_CHAR(false),
    SELECT_UP(false),
    SELECT_DOWN(false),
    SELECT_PAGE_UP(false),
    SELECT_PAGE_DOWN(false),
    SELECT_HOME(false),
    SELECT_END(false),
    SELECT_LEFT_WORD(false),
    SELECT_RIGHT_WORD(false),
    SELECT_NEXT_PARAGRAPH(false),
    SELECT_PREV_PARAGRAPH(false),
    SELECT_LINE_START(false),
    SELECT_LINE_END(false),
    SELECT_LINE_LEFT(false),
    SELECT_LINE_RIGHT(false),
    DESELECT(false),
    NEW_LINE(true),
    TAB(true),
    UNDO(true),
    REDO(true),
    CHARACTER_PALETTE(true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f108782a;

    s1(boolean z14) {
        this.f108782a = z14;
    }
}
