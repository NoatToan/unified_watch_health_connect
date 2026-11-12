package org.apache.commons.text.diff;

import kg.f;

/* JADX INFO: loaded from: classes3.dex */
public class StringsComparator {
    private final String left;
    private final String right;
    private final int[] vDown;
    private final int[] vUp;

    public static class Snake {
        private final int diag;
        private final int end;
        private final int start;

        public Snake(int i14, int i15, int i16) {
            this.start = i14;
            this.end = i15;
            this.diag = i16;
        }

        public int getDiag() {
            return this.diag;
        }

        public int getEnd() {
            return this.end;
        }

        public int getStart() {
            return this.start;
        }
    }

    public StringsComparator(String str, String str2) {
        this.left = str;
        this.right = str2;
        int length = str2.length() + str.length() + 2;
        this.vDown = new int[length];
        this.vUp = new int[length];
    }

    private void buildScript(int i14, int i15, int i16, int i17, EditScript<Character> editScript) {
        Snake middleSnake = getMiddleSnake(i14, i15, i16, i17);
        if (middleSnake != null && ((middleSnake.getStart() != i15 || middleSnake.getDiag() != i15 - i17) && (middleSnake.getEnd() != i14 || middleSnake.getDiag() != i14 - i16))) {
            buildScript(i14, middleSnake.getStart(), i16, middleSnake.getStart() - middleSnake.getDiag(), editScript);
            for (int start = middleSnake.getStart(); start < middleSnake.getEnd(); start++) {
                editScript.append(new KeepCommand<>(Character.valueOf(this.left.charAt(start))));
            }
            buildScript(middleSnake.getEnd(), i15, middleSnake.getEnd() - middleSnake.getDiag(), i17, editScript);
            return;
        }
        int i18 = i14;
        int i19 = i16;
        while (true) {
            if (i18 >= i15 && i19 >= i17) {
                return;
            }
            if (i18 < i15 && i19 < i17 && this.left.charAt(i18) == this.right.charAt(i19)) {
                editScript.append(new KeepCommand<>(Character.valueOf(this.left.charAt(i18))));
                i18++;
            } else if (i15 - i14 > i17 - i16) {
                editScript.append(new DeleteCommand<>(Character.valueOf(this.left.charAt(i18))));
                i18++;
            } else {
                editScript.append(new InsertCommand<>(Character.valueOf(this.right.charAt(i19))));
            }
            i19++;
        }
    }

    private Snake buildSnake(int i14, int i15, int i16, int i17) {
        int i18 = i14;
        while (true) {
            int i19 = i18 - i15;
            if (i19 >= i17 || i18 >= i16 || this.left.charAt(i18) != this.right.charAt(i19)) {
                break;
            }
            i18++;
        }
        return new Snake(i14, i18, i15);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    private Snake getMiddleSnake(int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        int i24 = i15 - i14;
        int i25 = i17 - i16;
        if (i24 == 0 || i25 == 0) {
            return null;
        }
        int i26 = i24 - i25;
        int i27 = i25 + i24;
        if (i27 % 2 != 0) {
            i27++;
        }
        int i28 = i27 / 2;
        int i29 = i28 + 1;
        this.vDown[i29] = i14;
        this.vUp[i29] = i15 + 1;
        for (int i30 = 0; i30 <= i28; i30++) {
            int i34 = -i30;
            for (int i35 = i34; i35 <= i30; i35 += 2) {
                int i36 = i35 + i28;
                if (i35 == i34) {
                    int[] iArr = this.vDown;
                    iArr[i36] = iArr[i36 + 1];
                } else {
                    if (i35 != i30) {
                        int[] iArr2 = this.vDown;
                        if (iArr2[i36 - 1] < iArr2[i36 + 1]) {
                            int[] iArr3 = this.vDown;
                            iArr3[i36] = iArr3[i36 + 1];
                        }
                    }
                    int[] iArr4 = this.vDown;
                    iArr4[i36] = iArr4[i36 - 1] + 1;
                }
                int i37 = this.vDown[i36];
                for (int i38 = ((i37 - i14) + i16) - i35; i37 < i15 && i38 < i17 && this.left.charAt(i37) == this.right.charAt(i38); i38++) {
                    i37++;
                    this.vDown[i36] = i37;
                }
                if (i26 % 2 != 0 && i26 - i30 <= i35 && i35 <= i26 + i30 && (i19 = this.vUp[i36 - i26]) <= this.vDown[i36]) {
                    return buildSnake(i19, (i35 + i14) - i16, i15, i17);
                }
            }
            int i39 = i26 - i30;
            int i44 = i39;
            while (true) {
                int i45 = i26 + i30;
                if (i44 <= i45) {
                    int i46 = (i44 + i28) - i26;
                    if (i44 == i39) {
                        int[] iArr5 = this.vUp;
                        iArr5[i46] = iArr5[i46 + 1] - 1;
                    } else {
                        if (i44 != i45) {
                            int[] iArr6 = this.vUp;
                            if (iArr6[i46 + 1] <= iArr6[i46 - 1]) {
                                int[] iArr7 = this.vUp;
                                iArr7[i46] = iArr7[i46 + 1] - 1;
                            }
                        }
                        int[] iArr8 = this.vUp;
                        iArr8[i46] = iArr8[i46 - 1];
                    }
                    int i47 = this.vUp[i46] - 1;
                    int i48 = ((i47 - i14) + i16) - i44;
                    while (i47 >= i14 && i48 >= i16 && this.left.charAt(i47) == this.right.charAt(i48)) {
                        this.vUp[i46] = i47;
                        i48--;
                        i47--;
                    }
                    if (i26 % 2 == 0 && i34 <= i44 && i44 <= i30 && (i18 = this.vUp[i46]) <= this.vDown[i46 + i26]) {
                        return buildSnake(i18, (i44 + i14) - i16, i15, i17);
                    }
                    i44 += 2;
                }
            }
        }
        f.n("Internal Error");
        return null;
    }

    public EditScript<Character> getScript() {
        EditScript<Character> editScript = new EditScript<>();
        buildScript(0, this.left.length(), 0, this.right.length(), editScript);
        return editScript;
    }
}
