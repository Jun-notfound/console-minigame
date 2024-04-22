import java.util.*;

public class MainTic {
	public static void main(String[] args) {
		
		String a [] = new String[3];
		String b [] = new String[3];
		String c [] = new String[3];
		//a, b, c 각각 'String'함수 적용(문자열 적용)
    	
    	char ch1;
		int num1 = 0;
		
		char ch2;
		int num2 = 0;
        
        int i;
        int hu1 = 0;
        int hu2 = 0;
        int ex = 0;
        for (i = 0; i < 3; i++) //칸 마다 별표 삽입
        {
            a[i] = " * ";
            b[i] = " * ";
            c[i] = " * ";
        }
        System.out.println(a[0] + a[1] + a[2]);
	    System.out.println(b[0] + b[1] + b[2]);
	    System.out.println(c[0] + c[1] + c[2]); //칸 전체 출력
	    System.out.println();        
        Scanner sc = new Scanner(System.in);
		while(true)
		{
			
	        
			for(; true;)
			{
				System.out.print("사람1('X') - 위치 입력 (a, b, c): "); //'a', 'b', 'c' 중 하나 입력 받기
	            ch1 = sc.next().charAt(0);
				System.out.print("칸 수 입력 (1~3): "); //칸 수 입력받기
				num1 = sc.nextInt(); 
				
	            
				if(ch1 == 'a') //ch1이 'a'가 맞는지 확인
				{
                    if(num1 == 1) //'a'의 num1 값이 1이면 진행
                    {
                        if(" X ".equals(a[0]) || " O ".equals(a[0])) //만약 'a[0]'에 이미 'X'나 'O'가 있으면
                        {
                            System.out.println(ch1 + " 위치에 " + num1 + "번 위치에 이미 있습니다.");//이미 위치에 자리에 있다고 알림.
                            System.out.println();
                            continue;
                        } 
                        else //아니면 'a[0]'에 " X " 삽입
                        {
                            a[0] = " X "; 
                            System.out.println();
            				System.out.println("사람1('X') 선택 위치 : " + ch1); //선택 위치 표시
            				System.out.println("칸 수 : " + num1); //칸 수 표시
            				System.out.println();
                            break;
                        }
                    } 
                    else if(num1 == 2) //'a'의 num1 값이 3이면 진행
                    {
                        if(" X ".equals(a[1]) || " O ".equals(a[1])) //만약 'a[1]'에 이미 'X'나 'O'가 있으면
                        {
                            System.out.println(ch1 + " 위치에 " + num1 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.
                            System.out.println();
                            continue;
                        } 
                        else //아니면 'a[1]'에 " X " 삽입
                        {
                            a[1] = " X "; 
                            System.out.println();
            				System.out.println("사람1('X') 선택 위치 : " + ch1); //선택 위치 표시
            				System.out.println("칸 수 : " + num1); //칸 수 표시
            				System.out.println();
                            break;
                        }
                    } 
                    else if(num1 == 3) //'a'의 num1 값이 3이면 진행
                    {
                        if(" X ".equals(a[2]) || " O ".equals(a[2])) //만약 'a[2]'에 이미 'X'나 'O'가 있으면
                        {
                            System.out.println(ch1 + " 위치에 " + num1 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.
                            System.out.println();
                            continue;
                        } 
                        else //아니면 'a[2]'에 " X " 삽입
                        {
                            a[2] = " X "; 
                            System.out.println();
            				System.out.println("사람1('X') 선택 위치 : " + ch1); //선택 위치 표시
            				System.out.println("칸 수 : " + num1); //칸 수 표시
            				System.out.println();
                            break;
                        }
                    }
                    else //아니면 번호 잘못입력했다고 알리기
                    {
                    	System.out.println("번호를 잘못 입력하셨습니다.");
                        System.out.println();
                    	continue;
                    }
                }
                else if(ch1 == 'b') //ch1이 'a'가 아니고 'b'가 맞는지 확인
				{
                    if(num1 == 1) //'b'의 num1 값이 1이면 진행
                    {
                        if(" X ".equals(b[0]) || " O ".equals(b[0])) //만약 'b[0]'에 이미 'X'나 'O'가 있으면
                        {
                            System.out.println(ch1 + " 위치에 " + num1 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.
                            System.out.println();
                            continue;
                        } 
                        else //아니면 'b[0]'에 " X " 삽입
                        {
                            b[0] = " X "; 
                            System.out.println();
            				System.out.println("사람1('X') 선택 위치 : " + ch1); //선택 위치 표시
            				System.out.println("칸 수 : " + num1); //칸 수 표시
            				System.out.println();
                            break;
                        }
                    } 
                    else if(num1 == 2) //'b'의 num1 값이 2이면 진행
                    {
                        if(" X ".equals(b[1]) || " O ".equals(b[1])) //만약 'b[1]'에 이미 'X'나 'O'가 있으면
                        {
                            System.out.println(ch1 + " 위치에 " + num1 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.
                            System.out.println();
                            continue;
                        } 
                        else //아니면 'b[1]'에 " X " 삽입
                        {
                            b[1] = " X "; 
                            System.out.println();
            				System.out.println("사람1('X') 선택 위치 : " + ch1); //선택 위치 표시
            				System.out.println("칸 수 : " + num1); //칸 수 표시
            				System.out.println();
                            break;
                        }
                    } 
                    else if(num1 == 3) //'b'의 num1 값이 3이면 진행
                    {
                        if(" X ".equals(b[2]) || " O ".equals(b[2])) //만약 'b[2]'에 이미 'X'나 'O'가 있으면
                        {
                            System.out.println(ch1 + " 위치에 " + num1 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.
                            System.out.println();
                            continue;
                        } 
                        else //아니면 'b[2]'에 " X " 삽입
                        {
                            b[2] = " X "; 
                            System.out.println();
            				System.out.println("사람1('X') 선택 위치 : " + ch1); //선택 위치 표시
            				System.out.println("칸 수 : " + num1); //칸 수 표시
            				System.out.println();
                            break;
                        }
                    } 
                    else
                    {
                    	System.out.println("번호를 잘못 입력하셨습니다."); //아니면 번호 잘못입력했다고 알리기
                        System.out.println();
                    	continue;
                    }
                }
				else if(ch1 == 'c') //ch1이 'a'가 아니고 'b'도 아니고 'c'가 맞는지 확인
				{
                    if(num1 == 1) //'c'의 num1 값이 1이면 진행
                    {
                        if(" X ".equals(c[0]) || " O ".equals(c[0])) //만약 'c[0]'에 이미 'X'나 'O'가 있으면
                        {
                            System.out.println(ch1 + " 위치에 " + num1 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.
                            System.out.println();
                            continue;
                        } 
                        else //아니면 'c[0]'에 " X " 삽입
                        {
                            c[0] = " X "; 
                            System.out.println();
            				System.out.println("사람1('X') 선택 위치 : " + ch1); //선택 위치 표시
            				System.out.println("칸 수 : " + num1); //칸 수 표시
            				System.out.println();
                            break;
                        }
                    } 
                    else if(num1 == 2) //'c'의 num1 값이 2이면 진행
                    {
                        if(" X ".equals(c[1]) || " O ".equals(c[1])) //만약 'c[1]'에 이미 'X'나 'O'가 있으면
                        {
                            System.out.println(ch1 + " 위치에 " + num1 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.
                            System.out.println();
                            continue;
                        } 
                        else //아니면 'c[1]'에 " X " 삽입
                        {
                            c[1] = " X "; 
                            System.out.println();
            				System.out.println("사람1('X') 선택 위치 : " + ch1); //선택 위치 표시
            				System.out.println("칸 수 : " + num1); //칸 수 표시
            				System.out.println();
                            break;
                        }
                    } 
                    else if(num1 == 3) //'c'의 num1 값이 3이면 진행
                    {
                        if(" X ".equals(c[2]) || " O ".equals(c[2])) //만약 'c[2]'에 이미 'X'나 'O'가 있으면
                        {
                            System.out.println(ch1 + " 위치에 " + num1 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.
                            System.out.println();
                            continue;
                        } 
                        else //아니면 'c[2]'에 " X " 삽입
                        {
                            c[2] = " X "; 
                            System.out.println();
            				System.out.println("사람1('X') 선택 위치 : " + ch1); //선택 위치 표시
            				System.out.println("칸 수 : " + num1); //칸 수 표시
            				System.out.println();
                            break;
                        }
                    }
                    else
                    {
                    	System.out.println("번호를 잘못 입력하셨습니다."); //아니면 번호 잘못입력했다고 알리기
                        System.out.println();
                    	continue;
                    }
                }
				else
				{
                    	System.out.println("칸 수를 잘못 입력하셨습니다."); //아니면 칸 수 잘못입력했다고 알리기
                        System.out.println();
				}
			}
            System.out.println(a[0] + a[1] + a[2]);
            System.out.println(b[0] + b[1] + b[2]);
            System.out.println(c[0] + c[1] + c[2]); //칸 전체 출력
            System.out.println();
            
            for(int h1 = 0; h1 < 3; h1++) //줄의 X,O가 한줄에 있는지 확인
            {
            	if((a[0].equals(" X ") && a[1].equals(" X ") && a[2].equals(" X ")) ||
                   (b[0].equals(" X ") && b[1].equals(" X ") && b[2].equals(" X ")) ||
                   (c[0].equals(" X ") && c[1].equals(" X ") && c[2].equals(" X ")))//세로줄
                {
                	hu1++;
                	break;
                }
                else if((a[0].equals(" X ") && b[0].equals(" X ") && c[0].equals(" X ")) ||
                		(a[1].equals(" X ") && b[1].equals(" X ") && c[1].equals(" X ")) ||
                		(a[2].equals(" X ") && b[2].equals(" X ") && c[2].equals(" X "))) //가로줄
                {
                	hu1++;
                	break;
                }
                else if((a[0].equals(" X ") && b[1].equals(" X ") && c[2].equals(" X ")) ||
                		(c[0].equals(" X ") && b[1].equals(" X ") && a[2].equals(" X "))) //대각선
                {
                	hu1++;
               		break;
                }
                else
                {
                	break;
                }
            }
            
            for(int f = 0; f < 3; f++)//중복확인
            {
            	if(" X ".equals(a[f]) || " O ".equals(a[f]))
            	{
            		if(" X ".equals(b[f]) || " O ".equals(b[f]))
            		{
            			if(" X ".equals(c[f]) || " O ".equals(c[f])) //만약 세가지 다 맞으면 
            			{
            				ex++; //1증가
            				continue;
            			}
            			else
            			{
            				break;
            			}
            		}
            		else
            		{
            			break;
            		}
            	}
            	else 
            	{
            		break; //아니면 나가기
            	}
            }
            if (hu1 == 1)//사람1이 이겼는지 확인
            {
            	System.out.print("사람 1 이김.");//이기면 출력 후 나감
            	break;
            }
            else if(ex == 3)
            {
            	System.out.print("무승부"); //아니면 나가기
            	break;
            }
            
            for(; true;)
            {
	            System.out.print("사람2('O') - 위치 입력 (a, b, c) : "); //'a', 'b', 'c' 중 하나 입력 받기
	            ch2 = sc.next().charAt(0);
	            System.out.print("칸 숫자를 입력하세요 (1~3) : "); //칸 수 입력받기
	            num2= sc.nextInt();
	            
	            if(ch2 == 'a') //ch2에 입력한 값이 'a'가 맞는지 확인
				{
				    if(num2 == 1) //'a'의 num2 값이 1이면 진행
					{
					    if(" X ".equals(a[0]) || " O ".equals(a[0]))
					    {
						    System.out.println(ch2 + "위치에" + num2 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.
						    System.out.println();
						    continue;
					    }
					    else
					    {
					        a[0] = " O "; //'a'의 0에 " O " 삽입
					        System.out.println();
				            System.out.println("사람2('O') 선택 위치 : " + ch2); //위치 표시
				            System.out.println("칸 수 : " + num2); //칸 수 표시
				            System.out.println();
						    break;
					    }
					}
					else if(num2 == 2) //'a'의 num2 값이 2이면
					{
                        if(" X ".equals(a[1]) || " O ".equals(a[1]))
                        {
                            System.out.println(ch2 + "위치에" + num2 + "번 위치에 이미 있습니다.");
                            System.out.println();//이미 위치에 자리에 있다고 알림.
						    continue;
                        }
                        else
                        {
                            a[1] = " O "; //'a'의 2에 " O " 삽입
                            System.out.println();
            	            System.out.println("사람2('O') 선택 위치 : " + ch2); //위치 표시
            	            System.out.println("칸 수 : " + num2); //칸 수 표시
            	            System.out.println();
                            break;
                        }
					}
					else if(num2 == 3) //'a'의 num2 값이 3이면
					{
                        if(" X ".equals(a[2]) || " O ".equals(a[2]))
                        {
						    System.out.println(ch2 + "위치에" + num2 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.
						    System.out.println();
						    continue;
                        }
                        else
                        {
                            a[2] = " O "; //'a'의 2에 " O " 삽입
                            System.out.println();
            	            System.out.println("사람2('O') 선택 위치 : " + ch2); //위치 표시
            	            System.out.println("칸 수 : " + num2); //칸 수 표시
            	            System.out.println();
						    break;
                        }
					}
					else //아니면 번호 잘못입력했다고 알리기
                    {
                    	System.out.println("번호를 잘못 입력하셨습니다."); 
                        System.out.println();
                    	continue;
                    }
				}
				else if(ch2 == 'b') //ch2에 입력한 값이 'a'가 아니면 'b'인지 확인
				{
				    if(num2 == 1) //'b'의 num2 값이 1이면 진행
					{
					    if(" X ".equals(b[0]) || " O ".equals(b[0])) //만약 'b[0]'에 이미 'X'나 'O'가 있으면
					    {
					        System.out.println(ch2 + "위치에" + num2 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.
					        System.out.println();
						    continue;
					    }
					    else //'b'의 0에 " O " 삽입
					    {
						    b[0] = " O "; 
						    System.out.println();
				            System.out.println("사람2('O') 선택 위치 : " + ch2); //위치 표시
				            System.out.println("칸 수 : " + num2); //칸 수 표시
				            System.out.println();
						    break;
					    }
					}
					else if(num2 == 2) //'b'의 num2 값이 2이면 진행
					{
					    if(" X ".equals(b[1]) || " O ".equals(b[1])) //만약 'b[1]'에 이미 'X'나 'O'가 있으면
					    {
					        System.out.println(ch2 + "위치에" + num2 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.
						    continue;
					    }
					    else //'b'의 1에" O " 삽입
					    {
						    b[1] = " O "; 
						    System.out.println();
				            System.out.println("사람2('O') 선택 위치 : " + ch2); //위치 표시
				            System.out.println("칸 수 : " + num2); //칸 수 표시
				            System.out.println();
						    break;
					    }
					}
					else if(num2 == 3) //'b'의 num2 값이 3이면 진행
					{
					    if (" X ".equals(b[2]) || " O ".equals(b[2]))  //만약 'b[2]'에 이미 'X'나 'O'가 있으면
					    {
					        System.out.println(ch2 + "위치에" + num2 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.
						    continue;
					    }
					    else
					    {
						    b[2] = " O "; //'b'의 2에 " O " 삽입
						    System.out.println();
				            System.out.println("사람2('O') 선택 위치 : " + ch2); //위치 표시
				            System.out.println("칸 수 : " + num2); //칸 수 표시
				            System.out.println();
						    break;
					    }
					}
					else
                    {
                    	System.out.println("번호를 잘못 입력하셨습니다."); //아니면 번호 잘못입력했다고 알리기
                        System.out.println();
                    	continue;
                    }
				}
				else if(ch2 == 'c') //ch2에 입력한 값이 'a'가 아니고 'b'도 아니고 'c'인지 확인
				{
				    if(num2 == 1) //'c'의 num2 값이 1이면 진행
					{
					    if (" X ".equals(c[0]) || " O ".equals(c[0])) //만약 'c[0]'에 이미 'X'나 'O'가 있으면
					    {
					        System.out.println(ch2 + "위치에" + num2 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.		
					        System.out.println();
						    continue;
					    }
					    else
					    {
						    c[0] = " O "; //'c'의 0에 " O " 삽입
						    System.out.println();
				            System.out.println("사람2('O') 선택 위치 : " + ch2); //위치 표시
				            System.out.println("칸 수 : " + num2); //칸 수 표시
				            System.out.println();
						    break;
					    }
					}
					else if(num2 == 2) //1이 아닌 'c'의 num2 값이 2이면 진행
					{
					    if (" X ".equals(c[1]) || " O ".equals(c[1])) //만약 'c[1]'에 이미 'X'나 'O'가 있으면
					    {
					        System.out.println(ch2 + "위치에" + num2 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.	
					        System.out.println();
						    continue;
					    }
					    else //'c'의 1에 " O " 삽입
					    {
						    c[1] = " O "; 
						    System.out.println();
				            System.out.println("사람2('O') 선택 위치 : " + ch2); //위치 표시
				            System.out.println("칸 수 : " + num2); //칸 수 표시
				            System.out.println();
						    break;
					    }
					}
					else if(num2 == 3) //1도 아니고 2도 아니고 'c'의 num2 값이 3이면 진행
					{
					    if(" X ".equals(c[2]) || " O ".equals(c[2])) //만약 'c[2]'에 이미 'X'나 'O'가 있으면
					    {
					        System.out.println(ch2 + "위치에" + num2 + "번 위치에 이미 있습니다."); //이미 위치에 자리에 있다고 알림.	
					        System.out.println();
						    continue;
					    }
					    else //아니면 'c'의 2에 " O " 삽입
					    {
						    c[2] = " O "; 
						    System.out.println();
				            System.out.println("사람2('O') 선택 위치 : " + ch2); //위치 표시
				            System.out.println("칸 수 : " + num2); //칸 수 표시
				            System.out.println();
						    break;
					    }
					}
					else
                    {
                    	System.out.println("번호를 잘못 입력하셨습니다."); //아니면 번호 잘못입력했다고 알리기
                        System.out.println();
                    	continue;
                    }
				}
				else
				{
                    	System.out.println("칸 수를 잘못 입력하셨습니다."); //아니면 칸 수 잘못입력했다고 알리기
                        System.out.println();
				}
            }
    		System.out.println(a[0] + a[1] + a[2]);
            System.out.println(b[0] + b[1] + b[2]);
            System.out.println(c[0] + c[1] + c[2]); //칸 전체 출력
            System.out.println();
            
            for (int h2 = 0; h2 < 3; h2++) //줄의 X,O가 있는지 확인
            {
                if ((a[0].equals(" O ") && b[0].equals(" O ") && c[0].equals(" O ")) ||
                    (a[1].equals(" O ") && b[1].equals(" O ") && c[1].equals(" O ")) ||
                    (a[2].equals(" O ") && b[2].equals(" O ") && c[2].equals(" O "))) //세로줄
                {
                    hu2++;//맞으면 1증가
                    break;
                } 
                else if ((a[0].equals(" O ") && a[1].equals(" O ") && a[2].equals(" O ")) ||
                         (b[0].equals(" O ") && b[1].equals(" O ") && b[2].equals(" O ")) ||
                         (c[0].equals(" O ") && c[1].equals(" O ") && c[2].equals(" O "))) //가로줄
                {
                    hu2++;
                    break;
                } 
                else if ((a[0].equals(" O ") && b[1].equals(" O ") && c[2].equals(" O ")) ||
                           (c[0].equals(" O ") && b[1].equals(" O ") && a[2].equals(" O "))) //대각선
                {
                    hu2++; 
                    break;
                }
            }
            
            for (int f = 0; f < 3; f++) //중복확인
            {
                if (" X ".equals(a[f]) || " O ".equals(a[f])) 
                {
                    if (" X ".equals(b[f]) || " O ".equals(b[f])) 
                    {
                        if (" X ".equals(c[f]) || " O ".equals(c[f])) //만약 세가지 다 맞으면 
                        {
                            ex++; //1증가
                            continue;
                        } 
                        else 
                        {
                            break;
                        }
                    } 
                    else 
                    {
                        break;
                    }
                } 
                else 
                {
                    break; //아니면 나가기
                }
            }
            if (hu2 == 1) //사람2가 이겼는지 확인 
            {
            	System.out.print("사람 2 이김."); //이기면 출력
            	break;
            }
            else if(ex == 3)
            {
            	System.out.print("무승부"); //비기면 출력
            	break;
            }
            else //아님 계속 진행
            {
            	continue;
            }
		}
		
	}
}