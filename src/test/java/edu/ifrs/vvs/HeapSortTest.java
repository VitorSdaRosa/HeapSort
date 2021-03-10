/**
 * @License
 * Copyright 2020 Bubble Sort Application
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.ifrs.vvs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Unit test for heap sort.
 */
class HeapSortTest {
    private HeapSort hs = new HeapSort();
    /**
     * HeapSort Test.
     */

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void arrayUmElemento() {
        int[] arrayTeste = new int[] {8};
        int[] arrayEsperado = new int[] {8};

        hs.sort(arrayTeste);
        assertArrayEquals(arrayTeste, arrayEsperado);
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void arrayVazio() {
        int[] arrayTeste = new int[] {};
        int[] arrayEsperado = new int[] {};

        hs.sort(arrayTeste);
        assertArrayEquals(arrayTeste, arrayEsperado);
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void arrayOrdem() {
        int[] arrayTeste = new int[] {8, 1, -88, 777, -6};
        int[] arrayEsperado = new int[] {-88, -6, 1, 8, 777};

        hs.sort(arrayTeste);
        assertArrayEquals(arrayTeste, arrayEsperado);
    }
}
